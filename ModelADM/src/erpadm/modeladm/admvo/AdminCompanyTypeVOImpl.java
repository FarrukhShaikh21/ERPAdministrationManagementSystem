package erpadm.modeladm.admvo;

import erpglobals.modelglobals.ERPViewObjectImpl;

import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Apr 17 21:43:34 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AdminCompanyTypeVOImpl extends ERPViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AdminCompanyTypeVOImpl() {
    }

    /**
     * Returns the variable value for P_ADF_GLOBAL_COMPANY_ID.
     * @return variable value for P_ADF_GLOBAL_COMPANY_ID
     */
    public Integer getP_ADF_GLOBAL_COMPANY_ID() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_GLOBAL_COMPANY_ID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_GLOBAL_COMPANY_ID.
     * @param value value to bind as P_ADF_GLOBAL_COMPANY_ID
     */
    public void setP_ADF_GLOBAL_COMPANY_ID(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_GLOBAL_COMPANY_ID", value);
    }

    /**
     * Returns the variable value for P_ADF_COMPANY_TYPE_SNO.
     * @return variable value for P_ADF_COMPANY_TYPE_SNO
     */
    public Integer getP_ADF_COMPANY_TYPE_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_COMPANY_TYPE_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_COMPANY_TYPE_SNO.
     * @param value value to bind as P_ADF_COMPANY_TYPE_SNO
     */
    public void setP_ADF_COMPANY_TYPE_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_COMPANY_TYPE_SNO", value);
    }

    /**
     * Returns the variable value for P_ADF_TYPE_LEVEL.
     * @return variable value for P_ADF_TYPE_LEVEL
     */
    public Integer getP_ADF_TYPE_LEVEL() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_TYPE_LEVEL");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_TYPE_LEVEL.
     * @param value value to bind as P_ADF_TYPE_LEVEL
     */
    public void setP_ADF_TYPE_LEVEL(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_TYPE_LEVEL", value);
    }

    /**
     * Returns the variable value for P_ADF_COMPANY_GROUP_SNO.
     * @return variable value for P_ADF_COMPANY_GROUP_SNO
     */
    public Integer getP_ADF_COMPANY_GROUP_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_COMPANY_GROUP_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_COMPANY_GROUP_SNO.
     * @param value value to bind as P_ADF_COMPANY_GROUP_SNO
     */
    public void setP_ADF_COMPANY_GROUP_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_COMPANY_GROUP_SNO", value);
    }
    @Override
    public void afterRollback(TransactionEvent transactionEvent) {
        // TODO Implement this method
        setErpViewObjectName("AdminCompanyTypeCRUD");
        setErpPkColumn("CompanyTypeSno");
        setErpParameterId("P_ADF_COMPANY_TYPE_SNO");
        super.afterRollback(transactionEvent);
    } 
}

