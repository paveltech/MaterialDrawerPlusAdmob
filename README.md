# MaterialDrawerPlusAdmob



<p align="center">
  <img src="https://raw.githubusercontent.com/paveltech/MaterialDrawerPlusAdmob/master/device-2017-04-25-153422.png" width="350"/>
</p>




```java

public class MainActivity extends MaterialNavigationDrawer{

    InterstitialAd interstitialAd;
    @Override
    public void init(Bundle savedInstanceState) {

        setDrawerHeaderImage(R.drawable.max_movie);
        this.addSection(newSection("Section 1" , new Fragment_1()));
        this.addSection(newSection("Section 2" , new Fragment_2()));
        this.addSection(newSection("Section 2" , new Fragment_3()));

        this.addSection(newSection("Section 4", R.mipmap.ic_launcher,new Fragment_1()).setSectionColor(Color.parseColor("#9c27b0")));
        this.addSection(newSection("Section 5",R.mipmap.ic_launcher,new Fragment_2()).setSectionColor(Color.parseColor("#03a9f4")));


        this.setBackPattern(MaterialNavigationDrawer.BACKPATTERN_BACK_TO_FIRST);
    }
}

```



```xml


<style name="BackPattern" parent="MaterialNavigationDrawerTheme.Light.DarkActionBar" >
        <item name="colorPrimary">#8bc34a</item>
        <item name="colorPrimaryDark">#558b2f</item>
        <item name="colorAccent">#FFFFFF</item>

    </style>





allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
  dependencies {
	        compile 'com.github.paveltech:MaterialDrawerPlusAdmob:1.0'
	}
 ```
