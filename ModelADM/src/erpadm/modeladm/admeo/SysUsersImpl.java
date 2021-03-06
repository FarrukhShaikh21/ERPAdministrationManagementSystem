package erpadm.modeladm.admeo;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 08 16:07:47 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SysUsersImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        UserId,
        UserName,
        Passwordd,
        IsLock,
        UserCode,
        ScanPath,
        Email,
        SavePath,
        MobileNo,
        CnicNo,
        IsExpired,
        ExpiryDate,
        LockDate,
        CitySno,
        CountrySno,
        Dob,
        LastLoginDate,
        CreatedBy,
        CreatedDate,
        GenderSno,
        PhoneNo,
        LastUpdatedBy,
        LastUpdatedDate,
        Remarks,
        AllowedIpAddress,
        UserTypeSno,
        AccessType,
        FirstName,
        LastName,
        PictureName,
        SysUserPasswordPolicy,
        SysUsersModule,
        SysUserCompany,
        SysActionGroupUser,
        SysUserGlobalCompany;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int USERID = AttributesEnum.UserId.index();
    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int PASSWORDD = AttributesEnum.Passwordd.index();
    public static final int ISLOCK = AttributesEnum.IsLock.index();
    public static final int USERCODE = AttributesEnum.UserCode.index();
    public static final int SCANPATH = AttributesEnum.ScanPath.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int SAVEPATH = AttributesEnum.SavePath.index();
    public static final int MOBILENO = AttributesEnum.MobileNo.index();
    public static final int CNICNO = AttributesEnum.CnicNo.index();
    public static final int ISEXPIRED = AttributesEnum.IsExpired.index();
    public static final int EXPIRYDATE = AttributesEnum.ExpiryDate.index();
    public static final int LOCKDATE = AttributesEnum.LockDate.index();
    public static final int CITYSNO = AttributesEnum.CitySno.index();
    public static final int COUNTRYSNO = AttributesEnum.CountrySno.index();
    public static final int DOB = AttributesEnum.Dob.index();
    public static final int LASTLOGINDATE = AttributesEnum.LastLoginDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int GENDERSNO = AttributesEnum.GenderSno.index();
    public static final int PHONENO = AttributesEnum.PhoneNo.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int ALLOWEDIPADDRESS = AttributesEnum.AllowedIpAddress.index();
    public static final int USERTYPESNO = AttributesEnum.UserTypeSno.index();
    public static final int ACCESSTYPE = AttributesEnum.AccessType.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int PICTURENAME = AttributesEnum.PictureName.index();
    public static final int SYSUSERPASSWORDPOLICY = AttributesEnum.SysUserPasswordPolicy.index();
    public static final int SYSUSERSMODULE = AttributesEnum.SysUsersModule.index();
    public static final int SYSUSERCOMPANY = AttributesEnum.SysUserCompany.index();
    public static final int SYSACTIONGROUPUSER = AttributesEnum.SysActionGroupUser.index();
    public static final int SYSUSERGLOBALCOMPANY = AttributesEnum.SysUserGlobalCompany.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SysUsersImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpadm.modeladm.admeo.SysUsers");
    }


    /**
     * Gets the attribute value for UserId, using the alias name UserId.
     * @return the value of UserId
     */
    public Integer getUserId() {
        return (Integer) getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserId.
     * @param value value to set the UserId
     */
    public void setUserId(Integer value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for UserName, using the alias name UserName.
     * @return the value of UserName
     */
    public String getUserName() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserName.
     * @param value value to set the UserName
     */
    public void setUserName(String value) {
        setAttributeInternal(USERNAME, value);
    }


    /**
     * Gets the attribute value for Passwordd, using the alias name Passwordd.
     * @return the value of Passwordd
     */
    public String getPasswordd() {
        return (String) getAttributeInternal(PASSWORDD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Passwordd.
     * @param value value to set the Passwordd
     */
    public void setPasswordd(String value) {
        setAttributeInternal(PASSWORDD, (value==null?"*@*@*@*@":value));
    }

    /**
     * Gets the attribute value for IsLock, using the alias name IsLock.
     * @return the value of IsLock
     */
    public String getIsLock() {
        return (String) getAttributeInternal(ISLOCK);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsLock.
     * @param value value to set the IsLock
     */
    public void setIsLock(String value) {
        setAttributeInternal(ISLOCK, value);
    }

    /**
     * Gets the attribute value for UserCode, using the alias name UserCode.
     * @return the value of UserCode
     */
    public String getUserCode() {
        return (String) getAttributeInternal(USERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserCode.
     * @param value value to set the UserCode
     */
    public void setUserCode(String value) {
        setAttributeInternal(USERCODE, value==null?null:value.toUpperCase());
    }


    /**
     * Gets the attribute value for ScanPath, using the alias name ScanPath.
     * @return the value of ScanPath
     */
    public String getScanPath() {
        return (String) getAttributeInternal(SCANPATH);
    }

    /**
     * Sets <code>value</code> as the attribute value for ScanPath.
     * @param value value to set the ScanPath
     */
    public void setScanPath(String value) {
        setAttributeInternal(SCANPATH, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for SavePath, using the alias name SavePath.
     * @return the value of SavePath
     */
    public String getSavePath() {
        return (String) getAttributeInternal(SAVEPATH);
    }

    /**
     * Sets <code>value</code> as the attribute value for SavePath.
     * @param value value to set the SavePath
     */
    public void setSavePath(String value) {
        setAttributeInternal(SAVEPATH, value);
    }

    /**
     * Gets the attribute value for MobileNo, using the alias name MobileNo.
     * @return the value of MobileNo
     */
    public String getMobileNo() {
        return (String) getAttributeInternal(MOBILENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for MobileNo.
     * @param value value to set the MobileNo
     */
    public void setMobileNo(String value) {
        setAttributeInternal(MOBILENO, value);
    }

    /**
     * Gets the attribute value for CnicNo, using the alias name CnicNo.
     * @return the value of CnicNo
     */
    public String getCnicNo() {
        return (String) getAttributeInternal(CNICNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CnicNo.
     * @param value value to set the CnicNo
     */
    public void setCnicNo(String value) {
        setAttributeInternal(CNICNO, value);
    }

    /**
     * Gets the attribute value for IsExpired, using the alias name IsExpired.
     * @return the value of IsExpired
     */
    public String getIsExpired() {
        return (String) getAttributeInternal(ISEXPIRED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsExpired.
     * @param value value to set the IsExpired
     */
    public void setIsExpired(String value) {
        setAttributeInternal(ISEXPIRED, value);
    }

    /**
     * Gets the attribute value for ExpiryDate, using the alias name ExpiryDate.
     * @return the value of ExpiryDate
     */
    public Timestamp getExpiryDate() {
        return (Timestamp) getAttributeInternal(EXPIRYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpiryDate.
     * @param value value to set the ExpiryDate
     */
    public void setExpiryDate(Timestamp value) {
        setAttributeInternal(EXPIRYDATE, value);
    }

    /**
     * Gets the attribute value for LockDate, using the alias name LockDate.
     * @return the value of LockDate
     */
    public Timestamp getLockDate() {
        return (Timestamp) getAttributeInternal(LOCKDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LockDate.
     * @param value value to set the LockDate
     */
    public void setLockDate(Timestamp value) {
        setAttributeInternal(LOCKDATE, value);
    }

    /**
     * Gets the attribute value for CitySno, using the alias name CitySno.
     * @return the value of CitySno
     */
    public Integer getCitySno() {
        return (Integer) getAttributeInternal(CITYSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CitySno.
     * @param value value to set the CitySno
     */
    public void setCitySno(Integer value) {
        setAttributeInternal(CITYSNO, value);
    }

    /**
     * Gets the attribute value for CountrySno, using the alias name CountrySno.
     * @return the value of CountrySno
     */
    public Integer getCountrySno() {
        return (Integer) getAttributeInternal(COUNTRYSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CountrySno.
     * @param value value to set the CountrySno
     */
    public void setCountrySno(Integer value) {
        setAttributeInternal(COUNTRYSNO, value);
    }

    /**
     * Gets the attribute value for Dob, using the alias name Dob.
     * @return the value of Dob
     */
    public Timestamp getDob() {
        return (Timestamp) getAttributeInternal(DOB);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dob.
     * @param value value to set the Dob
     */
    public void setDob(Timestamp value) {
        setAttributeInternal(DOB, value);
    }

    /**
     * Gets the attribute value for LastLoginDate, using the alias name LastLoginDate.
     * @return the value of LastLoginDate
     */
    public Timestamp getLastLoginDate() {
        return (Timestamp) getAttributeInternal(LASTLOGINDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastLoginDate.
     * @param value value to set the LastLoginDate
     */
    public void setLastLoginDate(Timestamp value) {
        setAttributeInternal(LASTLOGINDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for GenderSno, using the alias name GenderSno.
     * @return the value of GenderSno
     */
    public Integer getGenderSno() {
        return (Integer) getAttributeInternal(GENDERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for GenderSno.
     * @param value value to set the GenderSno
     */
    public void setGenderSno(Integer value) {
        setAttributeInternal(GENDERSNO, value);
    }

    /**
     * Gets the attribute value for PhoneNo, using the alias name PhoneNo.
     * @return the value of PhoneNo
     */
    public String getPhoneNo() {
        return (String) getAttributeInternal(PHONENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhoneNo.
     * @param value value to set the PhoneNo
     */
    public void setPhoneNo(String value) {
        setAttributeInternal(PHONENO, value);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Integer getLastUpdatedBy() {
        return (Integer) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Integer value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the value of LastUpdatedDate
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for AllowedIpAddress, using the alias name AllowedIpAddress.
     * @return the value of AllowedIpAddress
     */
    public String getAllowedIpAddress() {
        return (String) getAttributeInternal(ALLOWEDIPADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for AllowedIpAddress.
     * @param value value to set the AllowedIpAddress
     */
    public void setAllowedIpAddress(String value) {
        setAttributeInternal(ALLOWEDIPADDRESS, value);
    }


    /**
     * Gets the attribute value for UserTypeSno, using the alias name UserTypeSno.
     * @return the value of UserTypeSno
     */
    public Integer getUserTypeSno() {
        return (Integer) getAttributeInternal(USERTYPESNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserTypeSno.
     * @param value value to set the UserTypeSno
     */
    public void setUserTypeSno(Integer value) {
        setAttributeInternal(USERTYPESNO, value);
    }

    /**
     * Gets the attribute value for AccessType, using the alias name AccessType.
     * @return the value of AccessType
     */
    public String getAccessType() {
        return (String) getAttributeInternal(ACCESSTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccessType.
     * @param value value to set the AccessType
     */
    public void setAccessType(String value) {
        setAttributeInternal(ACCESSTYPE, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
        doSetUserName();
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
        doSetUserName();
    }

    /**
     * Gets the attribute value for PictureName, using the alias name PictureName.
     * @return the value of PictureName
     */
    public String getPictureName() {
        return (String) getAttributeInternal(PICTURENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for PictureName.
     * @param value value to set the PictureName
     */
    public void setPictureName(String value) {
        setAttributeInternal(PICTURENAME, value);
    }

    public void doSetUserName() {
        setUserName((getFirstName()==null?"":getFirstName()) + " "+ (getLastName()==null?"":getLastName()) );
    }
    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSysUserPasswordPolicy() {
        return (RowIterator) getAttributeInternal(SYSUSERPASSWORDPOLICY);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSysUsersModule() {
        return (RowIterator) getAttributeInternal(SYSUSERSMODULE);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSysUserCompany() {
        return (RowIterator) getAttributeInternal(SYSUSERCOMPANY);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSysActionGroupUser() {
        return (RowIterator) getAttributeInternal(SYSACTIONGROUPUSER);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSysUserGlobalCompany() {
        return (RowIterator) getAttributeInternal(SYSUSERGLOBALCOMPANY);
    }


    /**
     * @param userId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer userId) {
        return new Key(new Object[] { userId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
            super.lock();
        }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        
    if (operation!=DML_DELETE) {
        if (operation==DML_INSERT) {
        String result=ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(),"USER_ID",getEntityDef().getSource(),"1","1") ;

        setUserId(Integer.parseInt(result));

           }
            if ((!getPasswordd().equals("*@*@*@*@")) ) {
                String sqlquery = "";
                if (ERPGlobalPLSQLClass.doErpGetConnTypeModel(getDBTransaction()).equals("ERPORACLE")) {
                    sqlquery =
                        "begin " +
                        " update sys_user_password set is_active='N' where user_id="+getUserId()+";" +
                        " insert into sys_user_password(user_password_sno,passwordd,password_date,IS_ACTIVE,user_id)"+" \n"+
                        " values (seq_sys_user_password.nextval,DBMS_CRYPTO.encrypt (UTL_I18N.string_to_raw ('" + getPasswordd() +
                        "', 'AL32UTF8'),(6+ 256+ 4096),UTL_I18N.string_to_raw ('$rPl0G!NK$Ysyste', 'AL32UTF8')),sysdate,'Y',"+getUserId()+"); \n" +
                        " insert into SYS_USER_GLOBAL_COMPANY(user_global_company_sno,user_id,company_id,is_active,is_default,created_by,created_date)" +
                        " select SEQ_SYS_USER_GLOBAL_COMPANY.NEXTVAL,"+getUserId()+","+ERPGlobalPLSQLClass.doGetModelGlobalDefCompany()+",'Y','Y',"+ERPGlobalPLSQLClass.doGetModelUserSno()+",SYSDATE from dual where not exists (select null from sys_user_global_company gc where gc.user_id="+getUserId()+");"+
                        " end;";
                }
                else {
                    sqlquery =" update sys_user_password set is_active='N' where user_id="+getUserId()+";";
                    ERPGlobalPLSQLClass.doErpExecutePLSQLModel(getDBTransaction(), sqlquery,"N");
                    sqlquery="insert into sys_user_password(user_id,passwordd,password_date,is_active) "+
                        " values("+getUserId()+", AES_ENCRYPT('"+getPasswordd()+"','$rPl0G!NK$Ysyste'),sysdate(),'Y');";
                    ERPGlobalPLSQLClass.doErpExecutePLSQLModel(getDBTransaction(), sqlquery,"N");
                    sqlquery=" insert into SYS_USER_GLOBAL_COMPANY(user_id,company_id,is_active,is_default,created_by,created_date)" +
                    " select "+getUserId()+","+ERPGlobalPLSQLClass.doGetModelGlobalDefCompany()+",'Y','Y',"+ERPGlobalPLSQLClass.doGetModelUserSno()+",SYSDATE() from dual where not exists (select null from sys_user_global_company gc where gc.user_id="+getUserId()+")";
                 
                }
                //System.out.println(sqlquery);
                populateAttributeAsChanged(PASSWORDD, "*@*@*@*@");
                populateAttributeAsChanged(ISEXPIRED, "Y");
                ERPGlobalPLSQLClass.doErpExecutePLSQLModel(getDBTransaction(), sqlquery,"N");
            }
       
       }
        super.doDML(operation, e);
        
    }
    @Override
    public void afterCommit(TransactionEvent transactionEvent) {
        // TODO Implement this method
        super.afterCommit(transactionEvent);
        
    }
}

