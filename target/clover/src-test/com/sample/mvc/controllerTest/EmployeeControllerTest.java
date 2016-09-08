/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controllerTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sample.mvc.controller.EmployeeController;
import com.sample.mvc.model.EmployeeCommand;
import com.sample.mvc.service.EmployeeService;
import com.sample.mvc.service.EmployeeServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@ContextConfiguration(classes=BaseTestConfig.class)
//context
@ContextConfiguration(locations = {"classpath*:/WEB-INF/employee-servlet.xml"})

//@Transactional
public class EmployeeControllerTest {static class __CLR3_1_121m1mi4ze1ojo{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u006d\u0076\u006e\u0020\u0065\u0078\u0061\u006d\u0070\u006c\u0065\u005c\u005c\u0065\u006d\u0073\u005f\u0064\u0062\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1421401992310L,8589935092L,82,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	
//	@Autowired
//	private WebApplicationContext wac;
	
	
	 @Mock
	 private EmployeeServiceImpl employeeService;
	    @InjectMocks
	    private EmployeeController employeeController;
	 
	    private MockMvc mockMvc;
	 
	    @Before
	    public void setup() {try{__CLR3_1_121m1mi4ze1ojo.R.inc(58);
	 
	        // Process mock annotations
	        __CLR3_1_121m1mi4ze1ojo.R.inc(59);MockitoAnnotations.initMocks(this);
	 
	        // Setup Spring test in standalone mode
	        __CLR3_1_121m1mi4ze1ojo.R.inc(60);this.mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
}finally{__CLR3_1_121m1mi4ze1ojo.R.flushNeeded();}}
	    
	    @Test
	    public void testAddEmployee() throws Exception {__CLR3_1_121m1mi4ze1ojo.R.globalSliceStart(getClass().getName(),61);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_126ln4mc1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_121m1mi4ze1ojo.R.rethrow($CLV_t2$);}finally{__CLR3_1_121m1mi4ze1ojo.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controllerTest.EmployeeControllerTest.testAddEmployee",61,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_126ln4mc1p() throws Exception{try{__CLR3_1_121m1mi4ze1ojo.R.inc(61);
	     
	    	     
	        __CLR3_1_121m1mi4ze1ojo.R.inc(62);this.mockMvc.perform(post("/add")
	                .param("code", "101")
	                .param("name", "mvcfirst")
	                .param("city", "mvclastname"))
	                .andExpect(view().name("redirect:list"))
	                .andExpect(model().attributeExists("employeeCommand"));
	        __CLR3_1_121m1mi4ze1ojo.R.inc(63);Mockito.doCallRealMethod().when(employeeService).addEmployee(any(EmployeeCommand.class));
	        __CLR3_1_121m1mi4ze1ojo.R.inc(64);Mockito.verify(employeeService).addEmployee(any(EmployeeCommand.class));
	     
	    }finally{__CLR3_1_121m1mi4ze1ojo.R.flushNeeded();}}
	    
	    @Test
		public void findById()
				throws Exception {__CLR3_1_121m1mi4ze1ojo.R.globalSliceStart(getClass().getName(),65);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12mmo6i61t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_121m1mi4ze1ojo.R.rethrow($CLV_t2$);}finally{__CLR3_1_121m1mi4ze1ojo.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controllerTest.EmployeeControllerTest.findById",65,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12mmo6i61t() throws Exception{try{__CLR3_1_121m1mi4ze1ojo.R.inc(65);
	    	
	    	 __CLR3_1_121m1mi4ze1ojo.R.inc(66);EmployeeCommand emp = new EmployeeCommand();
	    	 __CLR3_1_121m1mi4ze1ojo.R.inc(67);emp.setCode(105);
            __CLR3_1_121m1mi4ze1ojo.R.inc(68);emp.setName("vikas");
            __CLR3_1_121m1mi4ze1ojo.R.inc(69);emp.setCity("pune");
			

			__CLR3_1_121m1mi4ze1ojo.R.inc(70);this.mockMvc
					.perform(post("/edit/{code}", 105))
					.andExpect(view().name("edit"))
					.andExpect(forwardedUrl("edit"))
//					.andExpect(model().attribute("employee",  105 /*hasProperty("code", is(105))*/))
					;

			__CLR3_1_121m1mi4ze1ojo.R.inc(71);when(employeeService.getEmployeebyId(anyInt())).thenReturn(emp);
			__CLR3_1_121m1mi4ze1ojo.R.inc(72);verify(employeeService).getEmployeebyId(anyInt());
			
		}finally{__CLR3_1_121m1mi4ze1ojo.R.flushNeeded();}}
	    
	    
	    @Test
		public void testViewHome()
		{__CLR3_1_121m1mi4ze1ojo.R.globalSliceStart(getClass().getName(),73);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12r66z4t21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_121m1mi4ze1ojo.R.rethrow($CLV_t2$);}finally{__CLR3_1_121m1mi4ze1ojo.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controllerTest.EmployeeControllerTest.testViewHome",73,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12r66z4t21(){try{__CLR3_1_121m1mi4ze1ojo.R.inc(73);
			
			__CLR3_1_121m1mi4ze1ojo.R.inc(74);Assert.assertEquals("home", employeeController.viewHome());
			
		}finally{__CLR3_1_121m1mi4ze1ojo.R.flushNeeded();}}
	    
	    @Test
	    public void testUpdateEmployee() throws Exception
	    {__CLR3_1_121m1mi4ze1ojo.R.globalSliceStart(getClass().getName(),75);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12uwq0a823();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_121m1mi4ze1ojo.R.rethrow($CLV_t2$);}finally{__CLR3_1_121m1mi4ze1ojo.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controllerTest.EmployeeControllerTest.testUpdateEmployee",75,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12uwq0a823() throws Exception{try{__CLR3_1_121m1mi4ze1ojo.R.inc(75);
	    	__CLR3_1_121m1mi4ze1ojo.R.inc(76);EmployeeCommand emp = new EmployeeCommand();
	    	 __CLR3_1_121m1mi4ze1ojo.R.inc(77);emp.setCode(105);
           __CLR3_1_121m1mi4ze1ojo.R.inc(78);emp.setName("vikas");
           __CLR3_1_121m1mi4ze1ojo.R.inc(79);emp.setCity("pune");
	    	__CLR3_1_121m1mi4ze1ojo.R.inc(80);employeeService.updateEmployee(emp);
	    	__CLR3_1_121m1mi4ze1ojo.R.inc(81);Mockito.verify(employeeService).updateEmployee(any(EmployeeCommand.class));
	    	
	    	
	    }finally{__CLR3_1_121m1mi4ze1ojo.R.flushNeeded();}}
}
