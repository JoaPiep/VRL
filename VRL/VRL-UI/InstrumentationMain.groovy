package my.testpackage;
public class MainCSG {


    public static eu.mihosoft.vrl.v3d.jcsg.CSG createSphere(double radius) {
        eu.mihosoft.vrl.v3d.jcsg.Sphere sphere;
        sphere = (new eu.mihosoft.vrl.v3d.jcsg.Sphere(radius));
        return sphere.toCSG();
    }
    public static eu.mihosoft.vrl.v3d.jcsg.CSG createCube(double dimensions) {
        eu.mihosoft.vrl.v3d.jcsg.Cube cube;
        cube = (new eu.mihosoft.vrl.v3d.jcsg.Cube(dimensions));
        return cube.toCSG();
    }
    public static eu.mihosoft.vrl.v3d.jcsg.CSG createDiff(double r1, double r2) {
//        eu.mihosoft.vrl.v3d.jcsg.CSG result;
 //        result = (createCube(r1));
//        return result.difference(createSphere(r2));
          return createCube(r1).difference(createSphere(r2));
    }
    public static void main(String[] args) {
        createDiff(13, 10);
        createDiff(13, 9);
        createDiff(13, 8);
        createDiff(13, 7);
    }
}
// <editor-fold defaultstate="collapsed" desc="VRL-Data">
/*<!VRL!><Type:VRL-Layout>
<map>
  <entry>
    <string>Script:my.testpackage.MainCSG:createCube:inv:toCSG</string>
    <layout>
      <x>484.17687065467305</x>
      <y>368.1251530202544</y>
      <width>453.9258292460979</width>
      <height>325.65816463448596</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createSphere:inv:return</string>
    <layout>
      <x>1060.6754997185637</x>
      <y>637.3930713483509</y>
      <width>327.1356399444985</width>
      <height>160.551381577889</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff:inv:op ASSIGN</string>
    <layout>
      <x>781.2158115210628</x>
      <y>83.35082344784453</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createCube</string>
    <layout>
      <x>58.05639757976792</x>
      <y>485.7751913976406</y>
      <width>793.6768012893114</width>
      <height>486.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createSphere:inv:op ASSIGN</string>
    <layout>
      <x>733.5939538785191</x>
      <y>181.91965160399423</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff:inv:difference</string>
    <layout>
      <x>894.1051849334559</x>
      <y>740.2003348813322</y>
      <width>433.30340428571503</width>
      <height>265.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createCube:inv:&lt;init&gt;</string>
    <layout>
      <x>522.3669779124697</x>
      <y>7.735606423317017</y>
      <width>432.4515142299233</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createSphere:inv:&lt;init&gt;</string>
    <layout>
      <x>678.2063186324276</x>
      <y>15.302523784982583</y>
      <width>423.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createSphere:inv:declare sphere</string>
    <layout>
      <x>330.5117886393008</x>
      <y>14.064331431459607</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createSphere:inv:declare radius</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createCube:inv:op ASSIGN</string>
    <layout>
      <x>642.591372212748</x>
      <y>191.4205035447564</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createCube:inv:declare dimensions</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>260.76727294921875</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>1222.0</width>
      <height>882.5198863636363</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createCube:inv:return</string>
    <layout>
      <x>1023.4116451155417</x>
      <y>554.0644782808687</y>
      <width>186.6853826151837</width>
      <height>148.47018343115735</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff:inv:return</string>
    <layout>
      <x>1552.8147575283479</x>
      <y>863.5510607070636</y>
      <width>481.6399626636951</width>
      <height>165.3916274608115</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:main:inv:createDiff:0</string>
    <layout>
      <x>551.5189604277881</x>
      <y>175.4688700958307</y>
      <width>493.15194582875756</width>
      <height>295.30203604145663</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:main:inv:createDiff:1</string>
    <layout>
      <x>0.0</x>
      <y>524.7829801119341</y>
      <width>480.57934824687493</width>
      <height>283.80791770063945</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createSphere</string>
    <layout>
      <x>433.49498761828767</x>
      <y>27.231853802680885</y>
      <width>414.2161979397515</width>
      <height>393.99326567216355</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff:inv:createSphere</string>
    <layout>
      <x>784.135093282742</x>
      <y>277.8182835071345</y>
      <width>622.9612424480731</width>
      <height>311.8217736064229</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:main:inv:createDiff:2</string>
    <layout>
      <x>548.2390393008366</x>
      <y>529.324236683927</y>
      <width>497.83413869367007</width>
      <height>289.32230214917354</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff:inv:declare result</string>
    <layout>
      <x>294.99593442784624</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:inv:declare this</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff:inv:declare r2</string>
    <layout>
      <x>0.0</x>
      <y>204.46654760484793</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff:inv:declare r1</string>
    <layout>
      <x>0.2909204568268864</x>
      <y>22.88761560216048</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createCube:inv:declare cube</string>
    <layout>
      <x>273.78445252407664</x>
      <y>4.53786385399022</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff</string>
    <layout>
      <x>892.4607897885192</x>
      <y>30.626309655243404</y>
      <width>657.5391845703125</width>
      <height>433.37371826171875</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:main:inv:declare args</string>
    <layout>
      <x>31.77878391671906</x>
      <y>0.0</y>
      <width>200.0</width>
      <height>150.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG</string>
    <layout>
      <x>0.0</x>
      <y>0.0</y>
      <width>2160.5</width>
      <height>1301.0</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:main:inv:createDiff</string>
    <layout>
      <x>2.5034704622206223</x>
      <y>184.11692229454846</y>
      <width>480.15421239841635</width>
      <height>291.66092328613877</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createSphere:inv:toCSG</string>
    <layout>
      <x>352.2731800248515</x>
      <y>371.91699112346686</y>
      <width>599.11219227352</width>
      <height>407.7267763945488</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:main</string>
    <layout>
      <x>954.3775475377942</x>
      <y>510.25580725864836</y>
      <width>1093.555908203125</width>
      <height>896.9336242675781</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
  <entry>
    <string>Script:my.testpackage.MainCSG:createDiff:inv:createCube</string>
    <layout>
      <x>279.3282229403371</x>
      <y>283.95382475296753</y>
      <width>410.2389748082358</width>
      <height>307.91302481580937</height>
      <contentVisible>true</contentVisible>
    </layout>
  </entry>
</map>
*/
// </editor-fold>
