package com.idega.block.school.data;


public interface SchoolUserHome extends com.idega.data.IDOHome
{
 public SchoolUser create() throws javax.ejb.CreateException;
 public SchoolUser findByPrimaryKey(Object pk) throws javax.ejb.FinderException;
 public java.util.Collection findBySchoolAndType(com.idega.block.school.data.School p0,int p1)throws javax.ejb.FinderException,java.rmi.RemoteException;
 public java.util.Collection findByUser(com.idega.user.data.User p0)throws javax.ejb.FinderException;
 public java.lang.Object getSchoolUserId(com.idega.block.school.data.School p0,com.idega.user.data.User p1,int p2)throws javax.ejb.FinderException;
 public java.util.Collection findBySchoolAndUser(com.idega.block.school.data.School p0,com.idega.user.data.User p1)throws javax.ejb.FinderException;

}