/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.mvc.dao.EmployeeDAO;
import com.sample.mvc.model.EmployeeCommand;

@Service
public class EmployeeServiceImpl  implements EmployeeService{public static class __CLR3_1_121c1ci4ze1ogb{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u006d\u0076\u006e\u0020\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u005c\u005c\u0065\u006d\u0073\u005f\u0064\u0062\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1421401991901L,8589935092L,58,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
    @Transactional
	public void addEmployee(EmployeeCommand employee) {try{__CLR3_1_121c1ci4ze1ogb.R.inc(48);
		__CLR3_1_121c1ci4ze1ogb.R.inc(49);employeeDAO.addEmployee(employee);
	}finally{__CLR3_1_121c1ci4ze1ogb.R.flushNeeded();}}

	@Override
    @Transactional
	public void deleteEmployee(Integer employeeId) {try{__CLR3_1_121c1ci4ze1ogb.R.inc(50);
		__CLR3_1_121c1ci4ze1ogb.R.inc(51);employeeDAO.deleteEmployee(employeeId);
	}finally{__CLR3_1_121c1ci4ze1ogb.R.flushNeeded();}}
	
	@Override
    @Transactional
	public EmployeeCommand getEmployeebyId(Integer employeeId) {try{__CLR3_1_121c1ci4ze1ogb.R.inc(52);
		__CLR3_1_121c1ci4ze1ogb.R.inc(53);return employeeDAO.getEmployeebyId(employeeId);
	}finally{__CLR3_1_121c1ci4ze1ogb.R.flushNeeded();}}

	@Override
	@Transactional
    public List<EmployeeCommand> listContact() {try{__CLR3_1_121c1ci4ze1ogb.R.inc(54);
        __CLR3_1_121c1ci4ze1ogb.R.inc(55);return employeeDAO.listContact();
    }finally{__CLR3_1_121c1ci4ze1ogb.R.flushNeeded();}}

	@Override
	@Transactional
	public void updateEmployee(EmployeeCommand employeeCommand) {try{__CLR3_1_121c1ci4ze1ogb.R.inc(56);
		__CLR3_1_121c1ci4ze1ogb.R.inc(57);employeeDAO.updateEmployee(employeeCommand);
	}finally{__CLR3_1_121c1ci4ze1ogb.R.flushNeeded();}}
	 

}
