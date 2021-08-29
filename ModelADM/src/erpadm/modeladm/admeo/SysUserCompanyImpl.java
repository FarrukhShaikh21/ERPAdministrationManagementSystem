package erpadm.modeladm.admeo;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Dec 07 17:24:38 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SysUserCompanyImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        UserCompanySno,
        UserId,
        CompanyId,
        IsActive,
        IsDefault,
        GlobalCompanyId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        AdminCompany,
        SysUsers;
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


    public static final int USERCOMPANYSNO = AttributesEnum.UserCompanySno.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int ISDEFAULT = AttributesEnum.IsDefault.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ADMINCOMPANY = AttributesEnum.AdminCompany.index();
    public static final int SYSUSERS = AttributesEnum.SysUsers.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SysUserCompanyImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpadm.modeladm.admeo.SysUserCompany");
    }


    /**
     * Gets the attribute value for UserCompanySno, using the alias name UserCompanySno.
     * @return the value of UserCompanySno
     */
    public Integer getUserCompanySno() {
        return (Integer) getAttributeInternal(USERCOMPANYSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserCompanySno.
     * @param value value to set the UserCompanySno
     */
    public void setUserCompanySno(Integer value) {
        setAttributeInternal(USERCOMPANYSNO, value);
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
     * Gets the attribute value for CompanyId, using the alias name CompanyId.
     * @return the value of CompanyId
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyId.
     * @param value value to set the CompanyId
     */
    public void setCompanyId(Integer value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for IsActive, using the alias name IsActive.
     * @return the value of IsActive
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsActive.
     * @param value value to set the IsActive
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for IsDefault, using the alias name IsDefault.
     * @return the value of IsDefault
     */
    public String getIsDefault() {
        return (String) getAttributeInternal(ISDEFAULT);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsDefault.
     * @param value value to set the IsDefault
     */
    public void setIsDefault(String value) {
        setAttributeInternal(ISDEFAULT, value);
    }

    /**
     * Gets the attribute value for GlobalCompanyId, using the alias name GlobalCompanyId.
     * @return the value of GlobalCompanyId
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlobalCompanyId.
     * @param value value to set the GlobalCompanyId
     */
    public void setGlobalCompanyId(Integer value) {
        setAttributeInternal(GLOBALCOMPANYID, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAdminCompany() {
        return (EntityImpl) getAttributeInternal(ADMINCOMPANY);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAdminCompany(EntityImpl value) {
        setAttributeInternal(ADMINCOMPANY, value);
    }

    /**
     * @return the associated entity SysUsersImpl.
     */
    public SysUsersImpl getSysUsers() {
        return (SysUsersImpl) getAttributeInternal(SYSUSERS);
    }

    /**
     * Sets <code>value</code> as the associated entity SysUsersImpl.
     */
    public void setSysUsers(SysUsersImpl value) {
        setAttributeInternal(SYSUSERS, value);
    }


    /**
     * @param userCompanySno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer userCompanySno) {
        return new Key(new Object[] { userCompanySno });
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
        if (operation==DML_INSERT) {
           String result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "USER_COMPANY_SNO",this.getEntityDef().getSource(), null, null);
           populateAttributeAsChanged(USERCOMPANYSNO, Integer.parseInt(result));
        }          
        super.doDML(operation, e);
    }
}
