package com.tmb.service;

import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

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


public interface TMBService {

    public boolean addBook(Book book) throws Exception;
    public Book getBookById(long id) throws Exception;
    public List<Book> getBookList() throws Exception;
    public boolean deleteBook(long id) throws Exception;
    public  String getRSAPublicKey() throws NoSuchAlgorithmException;
    public boolean saveEncryptedHMACSecretKey(String encryptedHMACSecretKey);
   // public User retriveUserData(String userid, String password);
    public boolean addUser(User user) throws Exception;
	public User getUserDetails(String userid, String password);
	public AccountSummary getAccountSummary(String name);
	public boolean createAccount(AccountDetails accountDetails) throws Exception;
	public  List<FromAccountsList> getFromAccountsList(String userid);
	public boolean addPayee(PayeeAccountDetails payeeAccountDetails)throws Exception;
	public List<BankDetails> getIFSCCode(IFSCCodeSearch iFSCCodeSearch);
	public List<AccountDetails> getUserAccountDetailsList(String userid);
	 public boolean transferMoney(FundTransferInput fundTransferInput) throws Exception;
	 public List<EMI> getEMIPayments(EMIInput eMIInput);
}
