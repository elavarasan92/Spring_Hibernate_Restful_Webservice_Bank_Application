package com.tmb.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tmb.dao.TMBDao;
import com.tmb.model.AccountDetails;
import com.tmb.model.AccountSummary;
import com.tmb.model.BankDetails;
import com.tmb.model.Book;
import com.tmb.model.FromAccountsList;
import com.tmb.model.PayeeAccountDetails;
import com.tmb.model.User;
import com.tmb.pojo.EMI;
import com.tmb.pojo.EMIInput;
import com.tmb.pojo.FundTransferInput;
import com.tmb.pojo.IFSCCodeSearch;
import com.tmb.utility.Utility;

import sun.misc.BASE64Encoder;

import java.math.BigDecimal;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.Map;


public class TMBServiceImpl implements TMBService{

    @Autowired
    TMBDao tMBDao;

    @Override
    public boolean addBook(Book book) throws Exception{
        return tMBDao.addBook(book);
    }

    @Override
    public Book getBookById(long id) throws Exception {
        return tMBDao.getBookById(id);
    }

    @Override
    public List<Book> getBookList() throws Exception {
        return tMBDao.getBookList();
    }

    @Override
    public boolean deleteBook(long id) throws Exception {
        return tMBDao.deleteBook(id);
    }

	
	public   String getRSAPublicKey() throws NoSuchAlgorithmException {
		
			KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
	        BASE64Encoder b64 = new BASE64Encoder();

	        generator.initialize(1024);

	        KeyPair pair = generator.generateKeyPair();
	        Key pubKey = pair.getPublic();
	        Key privKey = pair.getPrivate();
	        String pubKeyStr =b64.encode(pubKey.getEncoded());
//
//	        System.out.println("#######################################################################publicKey : " + b64.encode(pubKey.getEncoded()));
//	        System.out.println("privateKey : " + b64.encode(privKey.getEncoded()));
//		
		return pubKeyStr;
	}

	@Override
	public boolean saveEncryptedHMACSecretKey(String encryptedHMACSecretKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addUser(User user) throws Exception{
	
		return tMBDao.addUser(user);
	}

	@Override
	public User getUserDetails(String userid, String password) {
		// TODO Auto-generated method stub
		return tMBDao.getUserDetails(userid,password);
	}

	public AccountSummary getAccountSummary(String name) {
		// TODO Auto-generated method stub
		return tMBDao.getAccountSummary(name);
	}

	

	@Override
	public boolean createAccount(AccountDetails accountDetails) throws Exception {
		return tMBDao.createAccount(accountDetails);
		
	}

	@Override
	public   List<FromAccountsList> getFromAccountsList(String userid) {
		
		return tMBDao.getFromAccountsList(userid);
	}

	@Override
	public boolean addPayee(PayeeAccountDetails payeeAccountDetails) throws Exception {
		
		return tMBDao.addPayee(payeeAccountDetails);
	}

	@Override
	public List<BankDetails>  getIFSCCode(IFSCCodeSearch iFSCCodeSearch) {
		
		return tMBDao.getIFSCCode(iFSCCodeSearch);
	}

	@Override
	public List<AccountDetails> getUserAccountDetailsList(String userid) {
		
		return tMBDao.getUserAccountDetailsList(userid);
	}

	@Override
	public boolean transferMoney( FundTransferInput fundTransferInput)
			throws Exception {
		// TODO Auto-generated method stub
		return tMBDao.transferMoney(fundTransferInput);
	}

	@Override
	public List<EMI> getEMIPayments(EMIInput eMIInput) {
		
		// TODO Auto-generated method stub
		return Utility.emiCalc(eMIInput.getPrincipal(),eMIInput.getNoOfInstallments(),eMIInput.getRateOfInterest());
	}
	

//	@Override
//	public boolean saveEncryptedHMACSecretKey(String encryptedHMACSecretKey) {
//		
//		return false;
//	}

//	@Override
//	public User retriveUserData(String userid, String password) {
//		// TODO Auto-generated method stub
//		return tMBDao.retriveUserData(userid,password);
//	}
}
