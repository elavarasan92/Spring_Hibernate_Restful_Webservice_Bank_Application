package com.tmb.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.tmb.model.AccountDetails;
import com.tmb.model.AccountSummary;
import com.tmb.model.BankDetails;
import com.tmb.model.Book;
import com.tmb.model.FromAccountsList;
import com.tmb.model.PayeeAccountDetails;
import com.tmb.model.User;
import com.tmb.pojo.FundTransferInput;
import com.tmb.pojo.IFSCCodeSearch;


public interface TMBDao {

    public boolean addBook(Book book) throws Exception;
    public Book getBookById(long id) throws Exception;
    public List<Book> getBookList() throws Exception;
    public boolean deleteBook(long id) throws Exception;
    public boolean addUser(User user) throws Exception;
	public User getUserDetails(String userid, String password);
	public AccountSummary getAccountSummary(String name);
	public boolean createAccount(AccountDetails accountDetails)throws Exception;
	public  List<FromAccountsList> getFromAccountsList(String userid);
	 public boolean addPayee(PayeeAccountDetails payeeAccountDetails) throws Exception;
	 public List<BankDetails> getIFSCCode(IFSCCodeSearch iFSCCodeSearch);
	 public List<AccountDetails> getUserAccountDetailsList(String userid);
	 public boolean transferMoney(FundTransferInput fundTransferInput) throws Exception;
}
