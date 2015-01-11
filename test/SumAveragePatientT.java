/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class SumAveragePatientT {

    @Test
    public void test1() {
        Ip ip = new Ip();
        ip.setRolel1(YesNo.YES);
        ip.setRolel2(YesNo.YES);
        ip.setRolel3(YesNo.NO);
        ip.setRolel4(YesNo.NO);
        ip.setRolel5(YesNo.YES);

        assertEquals(3, sum(ip));
    }

        @Test
    public void test2() {
        Ip ip = new Ip();
        ip.setRolel1(YesNo.YES);
        ip.setRolel2(YesNo.YES);
        ip.setRolel3(YesNo.YES);
        ip.setRolel4(YesNo.YES);
        ip.setRolel5(YesNo.YES);

        assertEquals(5, sum(ip));
    }
    
    private int sum(Ip ip) {
        return ip.getRolel1().getScore()
                + ip.getRolel2().getScore()
                + ip.getRolel3().getScore()
                + ip.getRolel4().getScore()
                + ip.getRolel5().getScore();
    }
}
