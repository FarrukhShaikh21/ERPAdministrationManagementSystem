package erpadm.viewadm;

import erpglobals.modelglobals.ERPGlobalPLSQLClass;
import erpglobals.modelglobals.ERPUserAttribute;

import erpglobals.viewglobals.ERPGlobalsClass;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.server.DBTransaction;

import org.apache.myfaces.trinidad.model.UploadedFile;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class ERPADMClass {
    public ERPADMClass() {
        super();
    }
    private String ERPBackActionName="ERPBACKCRUD";
    private String lIteratorName="SysUsersCRUDIterator";
    private String lIteratorDetailName=null;
    private String l_operation;
    private Integer ERPuserId;
    private String ERPuserCode = "";
    private ERPUserAttribute ERPUserAttributes;
    private RichPanelTabbed ERPCountryrpt;// USING ON SEC_0007_EDIT
    private RichPanelTabbed ERPDefaultTab;
    private RichPanelTabbed ERPCompanyTab;//USING SEC_0006
    private Integer ERPparentCompanyCode;
    private Integer ERPCompanyCode;
    private Integer ERPCompanyTypeSno;
    private String ERPDisableParentNType="NO";
    private RichPopup ERPPopupCompanyType;
    private RichPopup lerpSupervisePopupConfirm;
    private RichPopup lerpUnSupervisePopupConfirm;
    private RichInputText ErpIteratorName;
    private RichInputText ErpFileStoreOn;
    private RichInputText ErpFileStorePath;
    private RichInputText ERPPrimaryKey;
    private RichInputFile ERPUploadFile;
    private String ERPAdminReportName;
    private String ERPPKForReport;
    private Integer ERPGlobalDefaultComp;


    public void setERPGlobalDefaultComp(Integer ERPGlobalDefaultComp) {
        this.ERPGlobalDefaultComp = ERPGlobalDefaultComp;
    }

    public Integer getERPGlobalDefaultComp() {
        return ERPGlobalDefaultComp;
    }


    public void setERPPKForReport(String ERPPKForReport) {
        this.ERPPKForReport = ERPPKForReport;
    }

    public String getERPPKForReport() {
        return ERPPKForReport;
    }


    public void setERPAdminReportName(String ERPAdminReportName) {
        this.ERPAdminReportName = ERPAdminReportName;
    }

    public String getERPAdminReportName() {
        return ERPAdminReportName;
    }

    public void setERPUploadFile(RichInputFile ERPUploadFile) {
        this.ERPUploadFile = ERPUploadFile;
    }

    public RichInputFile getERPUploadFile() {
        return ERPUploadFile;
    }


    public void setERPPrimaryKey(RichInputText ERPPrimaryKey) {
        this.ERPPrimaryKey = ERPPrimaryKey;
    }

    public RichInputText getERPPrimaryKey() {
        return ERPPrimaryKey;
    }


    public void setErpFileStoreOn(RichInputText ErpFileStoreOn) {
        this.ErpFileStoreOn = ErpFileStoreOn;
    }

    public RichInputText getErpFileStoreOn() {
        return ErpFileStoreOn;
    }

    public void setErpFileStorePath(RichInputText ErpFileStorePath) {
        this.ErpFileStorePath = ErpFileStorePath;
    }

    public RichInputText getErpFileStorePath() {
        return ErpFileStorePath;
    }


    public void setErpIteratorName(RichInputText ErpIteratorName) {
        this.ErpIteratorName = ErpIteratorName;
    }

    public RichInputText getErpIteratorName() {
        return ErpIteratorName;
    }




    public void setLerpSupervisePopupConfirm(RichPopup lerpSupervisePopupConfirm) {
        this.lerpSupervisePopupConfirm = lerpSupervisePopupConfirm;
    }

    public RichPopup getLerpSupervisePopupConfirm() {
        return lerpSupervisePopupConfirm;
    }

    public void setLerpUnSupervisePopupConfirm(RichPopup lerpUnSupervisePopupConfirm) {
        this.lerpUnSupervisePopupConfirm = lerpUnSupervisePopupConfirm;
    }

    public RichPopup getLerpUnSupervisePopupConfirm() {
        return lerpUnSupervisePopupConfirm;
    }

    public void setERPPopupCompanyType(RichPopup ERPPopupCompanyType) {
        this.ERPPopupCompanyType = ERPPopupCompanyType;
    }

    public RichPopup getERPPopupCompanyType() {
        return ERPPopupCompanyType;
    }

    public void setERPDisableParentNType(String ERPDisableParentNType) {
        this.ERPDisableParentNType = ERPDisableParentNType;
    }

    public String getERPDisableParentNType() {
        return ERPDisableParentNType;
    }

    public void setERPCompanyTab(RichPanelTabbed ERPCompanyTab) {
        this.ERPCompanyTab = ERPCompanyTab;
    }

    public RichPanelTabbed getERPCompanyTab() {
        return ERPCompanyTab;
    }


    public void setERPCompanyTypeSno(Integer ERPCompanyTypeSno) {
        this.ERPCompanyTypeSno = ERPCompanyTypeSno;
    }

    public Integer getERPCompanyTypeSno() {
        return ERPCompanyTypeSno;
    }

    public void setERPCompanyCode(Integer ERPCompanyCode) {
        this.ERPCompanyCode = ERPCompanyCode;
    }

    public Integer getERPCompanyCode() {
        return ERPCompanyCode;
    }

    public void setERPparentCompanyCode(Integer ERPparentCompanyCode) {
        this.ERPparentCompanyCode = ERPparentCompanyCode;
    }

    public Integer getERPparentCompanyCode() {
        return ERPparentCompanyCode;
    }

    public void setERPDefaultTab(RichPanelTabbed ERPDefaultTab) {
        this.ERPDefaultTab = ERPDefaultTab;
    }

    public RichPanelTabbed getERPDefaultTab() {
        return ERPDefaultTab;
    }

    public void setERPCountryrpt(RichPanelTabbed ERPCountryrpt) {
        this.ERPCountryrpt = ERPCountryrpt;
    }

    public RichPanelTabbed getERPCountryrpt() {
        return ERPCountryrpt;
    }


    public void setERPuserId(Integer ERPuserId) {
        this.ERPuserId = ERPuserId;
    }

    public Integer getERPuserId() {
        return ERPuserId;
    }

    public void setERPuserCode(String ERPuserCode) {
        this.ERPuserCode = ERPuserCode;
    }

    public String getERPuserCode() {
        return ERPuserCode;
    }

    public void setERPUserAttributes(ERPUserAttribute ERPUserAttributes) {
        this.ERPUserAttributes = ERPUserAttributes;
    }

    public ERPUserAttribute getERPUserAttributes() {
        return ERPUserAttributes;
    }

    public void setERPBackActionName(String ERPBackActionName) {
        this.ERPBackActionName = ERPBackActionName;
    }


    public void setLIteratorDetailName(String lIteratorDetailName) {
        this.lIteratorDetailName = lIteratorDetailName;
    }

    public String getLIteratorDetailName() {
        return lIteratorDetailName;
    }

    public void setLIteratorName(String lIteratorName) {
        this.lIteratorName = lIteratorName;
    }

    public String getLIteratorName() {
        return lIteratorName;
    }

    public void setL_operation(String l_operation) {
        this.l_operation = l_operation;
    }

    public String getL_operation() {
        return l_operation;
    }

    public String getERPBackActionName() {
        return ERPBackActionName;
    }
    
    /*
    public String doBackFromEdit() {
        if (ERPGlobalsClass.isRecordChanged(lIteratorName).equals("YES") ||(lIteratorDetailName!=null && ERPGlobalsClass.isRecordChanged(lIteratorDetailName).equals("YES"))) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
        }        
        return ERPBackActionName;
    }*/
    

    public String doBackFromEdit() {
        
        if (ERPGlobalsClass.doCheckERPTransactionDirty()) {
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
                }
        /*if (ERPGlobalsClass.isRecordChanged(lIteratorName).equals("YES") ||(lIteratorDetailName!=null && ERPGlobalsClass.isRecordChanged(lIteratorDetailName).equals("YES"))) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
        } */       
        return ERPBackActionName;
    }
    
    public String doDeleteDetailRecord() {
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation(l_operation);
        ob.execute();
        ob = ERPGlobalsClass.doGetERPOperation("Commit");
        ob.execute();
        ob = ERPGlobalsClass.doGetERPOperation("Rollback");
        ob.execute();
        doERPShowSaveMessage("Record Deleted Successfully.");
        return null;
    }
 
    public String doErpUndoRecord() {
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Rollback");
        ob.execute();
        doERPShowSaveMessage("Record Undo Successfully.");
        return null;
    }   
    public void doQueryChildByCompCode(DialogEvent erpde) {
        //this is using on form sec_0006_edit
        if (erpde.getOutcome()==DialogEvent.Outcome.ok) {
            BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
            DCIteratorBinding ib= (DCIteratorBinding)bc.get("AdminCompanyCRUDIterator");
            ib.getViewObject().setNamedWhereClauseParam("P_ADF_COMP_CODE", ib.getCurrentRow().getAttribute("txtChildCompanyCode"));
            ib.getViewObject().executeQuery();
        }
    }

    public String doViewParentCompany() {
        //this is using on form sec_0006_edit
            BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
            DCIteratorBinding ib= (DCIteratorBinding)bc.get("AdminCompanyCRUDIterator");
            ib.getViewObject().setNamedWhereClauseParam("P_ADF_COMP_CODE", ib.getCurrentRow().getAttribute("ParentCompCode"));
            ib.getViewObject().executeQuery();
        return null;
    }
    
    public void doSetAdmErpApplicationGlobals() {
       
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_SNO",1);
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_CODE","FARRUKH");
        ADFContext.getCurrent().getPageFlowScope().put("G_GLOBAL_DEF_COMPANY",1);
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_MODULE_ACTION","SEC_0008");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_COMP_ACCESS_TABLE","temp_admin_company_access");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_NAME","FARRUKH SHAIKH");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_PICTURE",null);
        
      // getERPUserAttributes().setUserCode(getERPuserCode());
       //getERPUserAttributes().setUserId(getERPuserId());
       
        setERPGlobalDefaultComp(1);
        if (1==1) {
            return;
       }
        System.out.println("one admission-B");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_SNO",getERPUserAttributes().getUserId());
        System.out.println("two erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_CODE",getERPUserAttributes().getUserCode());
        System.out.println("three erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_GLOBAL_DEF_COMPANY",getERPUserAttributes().getErpDefGloalCompany());
        setERPGlobalDefaultComp(getERPUserAttributes().getErpDefGloalCompany());
        System.out.println("four erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_COMP_ACCESS_TABLE",getERPUserAttributes().getErpTempCompanyAccessTable());
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_NAME",getERPUserAttributes().getERPUserName());
        System.out.println("five erp");
        getERPUserAttributes().setUserCode(getERPuserCode());
        getERPUserAttributes().setUserId(getERPuserId());
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_PICTURE",getERPUserAttributes().getERPUserPicture());
        System.out.println("six erp-01-adm-new"+getERPuserId());
        
    }
  
  public void doErpPOPEGrpLinSitSEC_0008(PopupFetchEvent pErppfe) {
      OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Execute");
      ob.execute();
  }
  
    public void doErpPOPEUserActionSEC_0012(PopupFetchEvent pErppfe) {
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Execute");
        ob.execute();
    } 
 
    public void doERPConfirmDelete(DialogEvent erpde) {
        //this is using on form sec_0006_edit
        if (erpde.getOutcome()==DialogEvent.Outcome.yes) {
            OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Delete");
            ob.execute();
            ob = ERPGlobalsClass.doGetERPOperation("Commit");
            Object o= ob.execute();
            doERPShowSaveMessage("Record Deleted Successfully.");
        }
    }
    
    public String doERPViewChildCompanyByCategory() {
        BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
        DCIteratorBinding ib= (DCIteratorBinding)bc.get("AdminCompanyCategorizationROIterator");
        DCIteratorBinding erpCompType=(DCIteratorBinding)bc.get("AdminCompantNextTypesROIterator");
            
            
        FacesCtrlHierBinding listBinding =
         (FacesCtrlHierBinding)bc.get("AdminCompanyCategorizationRO");
         listBinding.getViewObject().getViewCriteriaManager().applyViewCriteria(null);
        ViewCriteria vc = listBinding.getViewObject().getViewCriteriaManager().getViewCriteria("AdminCompanyByParentForCategoryVC");
        listBinding.getViewObject().getViewCriteriaManager().applyViewCriteria(vc);
        
        //setERPparentCompanyCode(Integer.parseInt(ib.getCurrentRow().getAttribute("txtParentCompanyCode").toString()) );
        setERPparentCompanyCode(Integer.parseInt(ib.getCurrentRow().getAttribute("ParentCompCode").toString()) );
        
        setERPCompanyCode(Integer.parseInt(ib.getCurrentRow().getAttribute("CompCode").toString()) );
        
        erpCompType.getViewObject().setNamedWhereClauseParam("P_ADF_COMPANY_TYPE_SNO", ib.getCurrentRow().getAttribute("CompanyTypeSno") );
        erpCompType.getViewObject().setNamedWhereClauseParam("P_ADF_GLOBAL_COMPANY_ID", ERPGlobalsClass.doGetGlobalDefCompany() );
        erpCompType.executeQuery();
        
        /*01-mar-2020 sunday
         * if (Integer.parseInt(ib.getCurrentRow().getAttribute("txtCountNextCompanyType").toString())==1) {
            setERPCompanyTypeSno(Integer.parseInt(ib.getCurrentRow().getAttribute("txtNextCompanyTypeSno").toString()));
        }
        else{
            setERPCompanyTypeSno(0);
        }*/
        ib.getViewObject().setNamedWhereClauseParam("P_ADF_PARENT_COMP_CODE",
                                                    ib.getCurrentRow().getAttribute("CompCode"));
        ib.getViewObject().executeQuery();
        return null;
    }

    public String doERPGotoParentCompanySEC_0006() {
        BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
        DCIteratorBinding ib = (DCIteratorBinding) bc.get("AdminCompanyCategorizationROIterator");
        DCIteratorBinding erpCompType=(DCIteratorBinding)bc.get("AdminCompantNextTypesROIterator");        
        
        FacesCtrlHierBinding listBinding =
         (FacesCtrlHierBinding)bc.get("AdminCompanyCategorizationRO");
         listBinding.getViewObject().getViewCriteriaManager().applyViewCriteria(null);
        ViewCriteria vc = listBinding.getViewObject().getViewCriteriaManager().getViewCriteria("AdminCompanyByParentForCategoryVC");
        listBinding.getViewObject().getViewCriteriaManager().applyViewCriteria(vc);
         //listBinding.getViewObject().applyViewCriteria("AdminCompanyByParentForCategoryVC");
        
     //    System.out.println("this is>"+listBinding.getAttribute(0)+ listBinding.getViewObject().getViewCriteriaManager().getViewCriteria("AdminCompanyByParentCompVC"));
         
        
        
        try {
           // System.out.println(getERPparentCompanyCode()+"getERPparentCompanyCode()");
           // System.out.println("ib.first().getAttribute" +
             //                  ib.getRowAtRangeIndex(0).getAttribute("txtParentParentCompanyCode"));
            System.out.println("this is first");
            ib.getViewObject().setNamedWhereClauseParam("P_ADF_PARENT_COMP_CODE",
                                                        ib.getRowAtRangeIndex(0).getAttribute("txtParentParentCompanyCode"));
            
        } catch (NullPointerException e) {//THIS EXCEPTION WILL BE RAISED WHEN THERE WILL BE NO CHILD
            // TODO: Add catch code
           // System.out.println("thi sis null pointer exception"+getERPparentCompanyCode());
            ib.getViewObject().setNamedWhereClauseParam("P_ADF_PARENT_COMP_CODE",getERPparentCompanyCode());
                    }
       // System.out.println("this is three getEstimatedRowCount"+ib.getEstimatedRowCount());
        
        System.out.println("this is three");
        ib.getViewObject().executeQuery();
       // System.out.println("this is three one"+ ib.getViewObject().getViewCriteria() +ib.getEstimatedRowCount());
       // System.out.println(ib.getRowAtRangeIndex(0).getAttribute("txtParentCompanyCode").toString());
        //System.out.println("this is four one");
        //setERPCompanyCode(Integer.parseInt(ib.getRowAtRangeIndex(0).getAttribute("txtParentCompanyCode").toString()) );
        setERPCompanyCode(Integer.parseInt(ib.getRowAtRangeIndex(0).getAttribute("ParentCompCode").toString()) );
        //System.out.println("this is four");
        setERPCompanyTypeSno(Integer.parseInt(ib.getRowAtRangeIndex(0).getAttribute("CompanyTypeSno").toString()) );

        erpCompType.getViewObject().setNamedWhereClauseParam("P_ADF_COMPANY_TYPE_SNO", ib.getRowAtRangeIndex(0).getAttribute("txtParentCompanyTypeSno") );
        erpCompType.getViewObject().setNamedWhereClauseParam("P_ADF_GLOBAL_COMPANY_ID", ERPGlobalsClass.doGetGlobalDefCompany() );
        
        erpCompType.executeQuery();
                
        //System.out.println("this is five");
        
        return null;
    }   
    public void doERPInitializeValuesOnFormOpen() {
        System.out.println("initialize calling");
        setERPparentCompanyCode(0);
        setERPCompanyCode(0);
        setERPCompanyTypeSno(1);
        setERPCompanyTab(getERPDefaultTab());
        setLIteratorName("SysUsersCRUDIterator");
    }
    public void doERPCreateRecordUnderParent() {
        BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
        DCIteratorBinding ib = (DCIteratorBinding) bc.get("AdminCompanyCategorizationROIterator");
        ViewObject vo= ib.getViewObject();
        
    }
    public String doERPAddRecord() {
 
        if (ERPGlobalsClass.isRecordChanged(lIteratorName).equals("YES") ) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Adding Record.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           return null;
        }        
               
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("CreateInsert");
        ob.execute();
                
        return null;
    }
  
    public String doERPAddRecordWithPara() {
    
        if (ERPGlobalsClass.isRecordChanged(lIteratorName).equals("YES") ) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Adding Record.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           return null;
        }        
               
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("CreateWithParams");
        ob.execute();
                
        return null;
    } 
  
    public void doERPShowSaveMessage(String pMessage){
        FacesContext context = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
        erks.addScript(context, "showNotificationCallback('"+pMessage+"')");
    }

    public String doERPCommitRecord() {

        OperationBinding ob=ERPGlobalsClass.doGetERPOperation("Commit");
        Object execute = ob.execute(); 
        ob.execute();
        //error occurs during saving the record.
        if (!ob.getErrors().isEmpty()) {
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));  
          return null;
        }
          doERPShowSaveMessage("Record Saved Successfully.");      
         return null;
    }

    public void doERPConfirmUnSuperviseDialog(DialogEvent de) {
        ///user wants to save the record
        if (de.getOutcome() == DialogEvent.Outcome.yes) {
            BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
            DCIteratorBinding ib = (DCIteratorBinding) bc.get(lIteratorName);
            ib.getCurrentRow().setAttribute("IsSupervised", "N");
            ib.getCurrentRow().setAttribute("SupervisedDate", null);
            ib.getCurrentRow().setAttribute("SupervisedBy", null);
            ib.getCurrentRow().setAttribute("IsUnsupervised", "Y");
            
            OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
            ob.execute();
            //error occurs during saving the record.
            if (!ob.getErrors().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));
                return;
            }
            doERPShowSaveMessage("Record Unupervised Successfully.");   
        }
    } 




    public void doERPConfirmSuperviseDialog(DialogEvent de) {
        ///user wants to save the record
        if (de.getOutcome() == DialogEvent.Outcome.yes) {
            BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
            DCIteratorBinding ib = (DCIteratorBinding) bc.get(lIteratorName);
            ib.getCurrentRow().setAttribute("IsSupervised", "Y");
            ib.getCurrentRow().setAttribute("IsUnsupervised", "N");
            ib.getCurrentRow().setAttribute("UnSupervisedDate", null);
            ib.getCurrentRow().setAttribute("UnSupervisedBy", null);
            OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
            ob.execute();
            //error occurs during saving the record.
            if (!ob.getErrors().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));
                return;
            }
            doERPShowSaveMessage("Record Supervised Successfully."); 
        }
    }

    public String doERPPopSupervisedRecord() {

        OperationBinding ob=ERPGlobalsClass.doGetERPOperation("Commit");
        Object execute = ob.execute(); 
        ob.execute();
        //error occurs during saving the record.
        if (!ob.getErrors().isEmpty()) {
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));  
          return null;
        }
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.lerpSupervisePopupConfirm.show(hints); 
         return null;
    }    
    public String doERPPopUnSuperviseRecord() {
         RichPopup.PopupHints hints = new RichPopup.PopupHints();
         this.lerpUnSupervisePopupConfirm.show(hints); 
          return null;
     }
    public String doVoidGetPath() {
     //   System.out.println(getErpStorePath().getValue()+ " path store on hard disk ");
        return null;
    }
    
    public void doUploadUserPic(ValueChangeEvent vce) {
//    public static void ErpuploadImage(UploadedFile file, String pUploadPath,String pColumnName, String pStoreOn, String pIteratorName) {
        ERPGlobalsClass.ErpuploadImage((UploadedFile)vce.getNewValue(), getErpFileStorePath().getValue().toString(), "PictureName", getErpFileStoreOn().getValue().toString(), "SysUsersCRUDIterator",getERPPrimaryKey().getValue().toString(),"1");
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
        ob.execute();
        getERPUploadFile().resetValue();
        
    }
  
  public String doExecuteAdminReport() {
      BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
      DCIteratorBinding ib = (DCIteratorBinding) bc.get(lIteratorName);
      DBTransaction Erpdbt=(DBTransaction)ib.getViewObject().getApplicationModule().getTransaction();
      String pUrl=ERPGlobalPLSQLClass.doExecuteSQLQueryModel(Erpdbt, "select value_description from sys_general_value v where v.value_set_id=8");
      ERPGlobalsClass.ErpdoOpenUrl(pUrl.replace("<P_REPORT_NAME>", ""+getERPAdminReportName()).replace("<P_REPORT_RUN_SNO>", ( getERPPKForReport()==null?"":getERPPKForReport()) )  );
      return null;   
  }
    
}
