package my.testpackage;

@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class MyFileClass {
    
    public int m1(int v1) {
        this.m1(v1);
    }
    public int m2(int v1, int v2) {
        this.m1(v1);
        this.m1(v2);
        this.m2(v1, v2);
    }
    public int m3(int v1, int v2, int v3) {
        this.m1(v1);
        this.m2(v1, v2);
        this.m3(v1, v2, v3);
    }
}
@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class MyFileClass2 {
    
    public int abc123(int a) {
    }
    public int abc1234(int a) {
    }
    public int m1(int v1) {
        this.m1(v1);
    }
    public int m2(int v1, int v2) {
        this.m1(v1);
        this.m1(v2);
        this.m2(v1, v2);
    }
    //<!VRL!> my special comment
    public int m3(int v1, int v2, int v3) {
        this.m2(v1, v2);
        this.m3(v1, v2, v3);
        this.m1(v1);
        this.println("1");
    }
    public int abc(int a) {
    }
}
@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class A {
    
    public void abc() {
    }
    public void a123() {
    }
}
@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class B {
    
    public void abc() {
    }
    public void a123() {
    }
}
/*<!VRL!><Type:VRL-Layout>
<map>
<entry>
<string>Script:my.testpackage.MyFileClass2:abc1234</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m3:inv:m1</string>
<layout>
<x>704.6441964063256</x>
<y>657.0494725665422</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m1</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m3:inv:m2</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m2:inv:m1</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m1:inv:m1</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:abc123</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m2:inv:m2</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m3:inv:m3</string>
<layout>
<x>695.08033690119</x>
<y>457.78689961571</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.A</string>
<layout>
<x>1868.4785356058237</x>
<y>2061.7378689766824</y>
<width>550.0</width>
<height>503.26843633505877</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.B</string>
<layout>
<x>323.8953767026647</x>
<y>1234.6129653136866</y>
<width>550.0</width>
<height>800.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:abc</string>
<layout>
<x>423.37108952951377</x>
<y>448.52184732334626</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>728.1025562102036</width>
<height>713.9038297285963</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.B:abc</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m2</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m3</string>
<layout>
<x>726.4184408526169</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2</string>
<layout>
<x>1026.7187904742657</x>
<y>848.291569406082</y>
<width>1220.421598292887</width>
<height>860.236342502569</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass2:m3:inv:println</string>
<layout>
<x>1395.211771290391</x>
<y>788.7401451111365</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m1:inv:m1</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>893.25</width>
<height>977.25</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m1</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m2:inv:m2</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m3:inv:m3</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m3:inv:m1</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m3:inv:m2</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.A:abc</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m2</string>
<layout>
<x>781.5724847164374</x>
<y>0.0</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m2:inv:m1</string>
<layout>
<x>0.0</x>
<y>0.0</y>
<width>400.0</width>
<height>100.0</height>
<contentVisible>true</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.MyFileClass:m3</string>
<layout>
<x>497.0208761085538</x>
<y>731.7851486800416</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.B:a123</string>
<layout>
<x>404.5740125995741</x>
<y>482.1635492625061</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
<entry>
<string>Script:my.testpackage.A:a123</string>
<layout>
<x>523.3454003490184</x>
<y>402.08244173156294</y>
<width>400.0</width>
<height>300.0</height>
<contentVisible>false</contentVisible>
</layout>
</entry>
</map>
*/
// <editor-fold defaultstate="collapsed" desc="VRL-Data">
/*<!VRL!><Type:VRL-Layout>
<map>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:abc1234</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3:inv:m1</string>
    <layout>
      <x>704.6441964063256</x>
      <y>657.0494725665422</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3:inv:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m2:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m1:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:abc123</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m2:inv:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3:inv:m3</string>
    <layout>
      <x>695.08033690119</x>
      <y>457.78689961571</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.A</string>
    <layout>
      <x>1868.4785356058237</x>
      <y>2061.7378689766824</y>
      <width>550.0</width>
      <height>503.26843633505877</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.B</string>
    <layout>
      <x>323.8953767026647</x>
      <y>1234.6129653136866</y>
      <width>550.0</width>
      <height>800.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:abc</string>
    <layout>
      <x>423.37108952951377</x>
      <y>448.52184732334626</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>728.1025562102036</width>
      <height>713.9038297285963</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.B:abc</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3</string>
    <layout>
      <x>726.4184408526169</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2</string>
    <layout>
      <x>1026.7187904742657</x>
      <y>848.291569406082</y>
      <width>1220.421598292887</width>
      <height>860.236342502569</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass2:m3:inv:println</string>
    <layout>
      <x>1395.211771290391</x>
      <y>788.7401451111365</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m1:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>893.25</width>
      <height>977.25</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m2:inv:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m3</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3:inv:m2</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.A:abc</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m2</string>
    <layout>
      <x>781.5724847164374</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m2:inv:m1</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>400.0</width>
      <height>100.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MyFileClass:m3</string>
    <layout>
      <x>497.0208761085538</x>
      <y>731.7851486800416</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.B:a123</string>
    <layout>
      <x>404.5740125995741</x>
      <y>482.1635492625061</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.A:a123</string>
    <layout>
      <x>523.3454003490184</x>
      <y>402.08244173156294</y>
      <width>400.0</width>
      <height>300.0</height>
      <contentVisible>false</contentVisible>
    </layout>
  </entry>
</map>
*/
// </editor-fold>