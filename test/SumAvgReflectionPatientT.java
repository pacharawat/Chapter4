/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K.Pacharawat
 */
public class SumAvgReflectionPatientT {

    @Test
    public void test1() throws Exception {
        Ip ip = new Ip();
        ip.setRolel1(YesNo.YES);
        ip.setRolel2(YesNo.YES);
        ip.setRolel3(YesNo.NO);
        ip.setRolel4(YesNo.NO);
        ip.setRolel5(YesNo.YES);

        assertEquals(3, sum(ip));
    }

    @Test
    public void test2() throws Exception {
        Ip ip = new Ip();
        ip.setRolel1(YesNo.YES);
        ip.setRolel2(YesNo.YES);
        ip.setRolel3(YesNo.YES);
        ip.setRolel4(YesNo.YES);
        ip.setRolel5(YesNo.YES);

        assertEquals(5, sum(ip));
    }

    private int sum(Patient ip) throws Exception {
        int sum = 0;
        Method[] methods = ip.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("getRole")) {
                YesNo yn = (YesNo) method.invoke(ip);
                sum = sum + yn.getScore();
            }
        }
        return sum;
    }
}
