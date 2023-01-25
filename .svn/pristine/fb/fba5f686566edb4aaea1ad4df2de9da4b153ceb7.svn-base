//
//package com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
// 
//public class SecurityConfig {
// 
//    public static final String ROLE_ADMIN = "ADMIN";
//    public static final String ROLE_SUBCONTRACTOR = "SUBCONTRACTOR";
//    public static final String ROLE_PAYROLL = "PAYROLL";
// 
//    // String: Role
//    // List<String>: urlPatterns.
//    private static final Map<String, List<String>> mapConfig = new HashMap<String, List<String>>();
// 
//    static {
//        init();
//    }
// 
//    private static void init() {
// 
//        // Configure For "ADMIN" Role.
//        List<String> urlPatterns1 = new ArrayList<String>();
// 
//        urlPatterns1.add("/admin/home");
//        urlPatterns1.add("/usersubcontractor/home");
//        urlPatterns1.add("/userpayroll/payrollcompanies");
// 
//        mapConfig.put(ROLE_ADMIN, urlPatterns1);
// 
//        // Configure For "SUBC" Role.
//        List<String> urlPatterns2 = new ArrayList<String>();
// 
//       urlPatterns1.add("/admin/home");
//        urlPatterns1.add("/usersubcontractor/home");
//        urlPatterns1.add("/userpayroll/payrollcompanies");
// 
//        mapConfig.put(ROLE_SUBCONTRACTOR, urlPatterns2);
//        
//        
//        // Configure For "PAYROLL" Role.
//        List<String> urlPatterns3 = new ArrayList<String>();
// 
//      urlPatterns1.add("/admin/home");
//        urlPatterns1.add("/usersubcontractor/home");
//        urlPatterns1.add("/userpayroll/payrollcompanies");
// 
//        mapConfig.put(ROLE_SUBCONTRACTOR, urlPatterns3);
//    }
// 
//    public static Set<String> getAllAppRoles() {
//        return mapConfig.keySet();
//    }
// 
//    public static List<String> getUrlPatternsForRole(String role) {
//        return mapConfig.get(role);
//    }
// 
//}