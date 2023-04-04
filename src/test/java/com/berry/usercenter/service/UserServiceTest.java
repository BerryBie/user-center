//package com.berry.usercenter.service;
//import java.util.Date;
//
//import com.berry.usercenter.model.domain.User;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.annotation.Resource;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * @author Berry
// * @version 1.0
// * 用户服务测试
// */
//@SpringBootTest
//public class UserServiceTest {
//
//    @Resource
//    private UserService userService;
//
////    @Test
////    public void testAddUser(){
////        User user = new User();
////        user.setUsername("dogdog");
////        user.setUserAccount("123");
////        user.setAvatarUrl("https://th.bing.com/th/id/R.baf2e9dd6063f9f49f99e2b2cb1bec77?rik=sJfg69eThyLZKg&riu=http%3a%2f%2fwww.pixelstalk.net%2fwp-content%2fuploads%2f2016%2f08%2fCute-Puppy-Background-Download-Free-1.jpg&ehk=9UE1O2AByYZsSCNXb%2bIb9Jjxzw5fGffRKA1LlpkKZ1A%3d&risl=&pid=ImgRaw&r=0");
////        user.setGender(0);
////        user.setUserPassword("xxx");
////        user.setPhone("123");
////        user.setEmail("456");
////
////        boolean result = userService.save(user);
////        System.out.println(user.getId());
////        assertTrue(result);
////
////    }
//
//    @Test
//    void userRegister() {
//        String userAccount = "berry";
//        String userPassword = "";
//        String checkPassword = "123456";
//        String planetCode = "1";
//
//        long result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1,result);
//
//        userAccount = "ber";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1,result);
//
//        userAccount = "berry";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1,result);
//
//        userAccount = "be rry";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1,result);
//
//        checkPassword = "1234567890";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1,result);
//
//        userAccount = "user002";
//        userPassword = "1234567890";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1,result);
//
//        userAccount = "berrybie";
//        result = userService.userRegister(userAccount, userPassword, checkPassword, planetCode);
//        Assertions.assertEquals(-1,result);
//    }
//}