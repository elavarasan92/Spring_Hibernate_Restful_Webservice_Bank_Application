package com.tmb.serachifsc;

import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class SearchIFSC {
	public static void main (String [] args) throws ParseException
	{
		SearchIFSC searchIFSC = new SearchIFSC();
		searchIFSC.getBankDetailsList(null, "e".toUpperCase(), null);
		
	}

	public  List<BankDetails> getBankDetailsList(String bankName,String iFSCCode, String city) {
		
	
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Criteria criteria = session.createCriteria(BankDetails.class);
		if(bankName!=null)
		{
			criteria.add(Restrictions.eq("bankName",bankName));
		}
		if(iFSCCode!=null)
		{
			if(iFSCCode.length()==11)
			{
				criteria.add(Restrictions.eq("iFSCCode",iFSCCode));
			}
			else if(iFSCCode.length()>0&&iFSCCode.length()<11)
			{
				criteria.add(Restrictions.like("iFSCCode", iFSCCode, MatchMode.ANYWHERE));
			}
			
		}
		if(city!=null)
		{
			criteria.add(Restrictions.eq("city",city));
		}
		
//		ProjectionList projectionList = Projections.projectionList();
//		projectionList.add(Projections.property("accountHolderName"));
//		projectionList.add(Projections.property("accountNumber"));
//		projectionList.add(Projections.property("balance"));
		
	//	criteria.setProjection(projectionList);
		
		List list = criteria.list();
		System.out.println("#######################################"+list);
//		Iterator iterator = list.iterator();
//		List<BankDetails> bankDetailsList = new ArrayList<BankDetails>();
//		while(iterator.hasNext())
//		{
//			Object object[] = (Object[])iterator.next();
//			BankDetails bankDetails = new BankDetails();
//			bankDetails.set((String) object[0]);
//			bankDetails.setAccountNumber((String) object[1]);
//			bankDetails.setBalance((BigDecimal) object[2]);
//			bankDetailsList.add(fromAccount);
//			
//		}
		tx.commit();
		session.close();
		//return bankDetailsList;
		return list;
	}
}