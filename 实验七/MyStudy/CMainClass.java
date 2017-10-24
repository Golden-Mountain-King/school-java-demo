/**
 * CMainClass
 */
package Experiment06;
import Experiment06.SubPack01.*;
import Experiment06.SubPack02.*;
public class CMainClass {
    public static void main(String[] args) {
        CClassInPack01 c1 = new CClassInPack01();
        CClassInPack02 c2 = new CClassInPack02();
        c1.f();
        c2.t();
    }
} 