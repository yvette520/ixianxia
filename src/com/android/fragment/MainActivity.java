package com.android.fragment;

import java.util.Locale;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
     * will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;
    
    ImageButton imgbtn1;
    ImageButton imgbtn2;
    ImageButton imgbtn3;
    ImageButton imgbtn4;
    ImageButton imgbtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the action bar.
       /* final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);*/
        //actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.background));
        //actionBar.setDisplayOptions(int);
        
        imgbtn1=(ImageButton)findViewById(R.id.imagebutton1);
        imgbtn2=(ImageButton)findViewById(R.id.imagebutton2);
        imgbtn3=(ImageButton)findViewById(R.id.imagebutton3);
        imgbtn4=(ImageButton)findViewById(R.id.imagebutton4);
        imgbtn5=(ImageButton)findViewById(R.id.imagebutton5);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the app.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
               // actionBar.setSelectedNavigationItem(position);
            }
        });

        // For each of the sections in the app, add a tab to the action bar.
       /* for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
            // Create a tab with text corresponding to the page title defined by
            // the adapter. Also specify this Activity object, which implements
            // the TabListener interface, as the callback (listener) for when
            // this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }*/
        
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View v) {
/*                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ixx.portal.ixianxia.com/"));
                startActivity(intent);*/
            	//imgbtn1.setImageDrawable(getResources().getDrawable(R.drawable.blue));
            	if (mViewPager != null) {
            		mViewPager.setCurrentItem(0, true);
            	}
            }
        });
        
        
       imgbtn2.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View v) {
/*                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ixx.portal.ixianxia.com/"));
                startActivity(intent);*/
            	//imgbtn2.setImageDrawable(getResources().getDrawable(R.drawable.green));
            	if (mViewPager != null) {
            		mViewPager.setCurrentItem(1, true);
            	}

            }
        });
        
       imgbtn3.setOnClickListener(new View.OnClickListener() {
           
           public void onClick(View v) {
/*                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ixx.portal.ixianxia.com/"));
               startActivity(intent);*/
           //	imgbtn3.setImageDrawable(getResources().getDrawable(R.drawable.green));
        	if (mViewPager != null) {
        		mViewPager.setCurrentItem(2, true);
        	}
        	
           }
       });
       
       
       imgbtn4.setOnClickListener(new View.OnClickListener() {
           
           public void onClick(View v) {
/*                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ixx.portal.ixianxia.com/"));
               startActivity(intent);*/
           //	imgbtn4.setImageDrawable(getResources().getDrawable(R.drawable.green));
        	if (mViewPager != null) {
        		mViewPager.setCurrentItem(3, true);
        	}
           }
       });
       
       imgbtn5.setOnClickListener(new View.OnClickListener() {
           
           public void onClick(View v) {
/*                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ixx.portal.ixianxia.com/"));
               startActivity(intent);*/
           //	imgbtn5.setImageDrawable(getResources().getDrawable(R.drawable.green));
        	if (mViewPager != null) {
        		mViewPager.setCurrentItem(4, true);
        	}
           }
       });
       
    }
    
    
    
    
/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    */
    
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        // When the given tab is selected, switch to the corresponding page in
        // the ViewPager.
        mViewPager.setCurrentItem(tab.getPosition());
        
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public SectionFragment mfragment = null;
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a DummySectionFragment (defined as a static inner class
            // below) with the page number as its lone argument.
        	mfragment = new SectionFragment();
            Bundle args = new Bundle();
            args.putInt(SectionFragment.ARG_SECTION_NUMBER, position + 1);
            mfragment.setArguments(args);
            
            return mfragment;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toLowerCase(l);
                case 1:
                    return getString(R.string.title_section2).toLowerCase(l);
                case 2:
                    return getString(R.string.title_section3).toLowerCase(l);
                case 3:
                	return getString(R.string.title_section4).toLowerCase(l);
                case 4:
                	return getString(R.string.title_section5).toLowerCase(l);
            }
            return null;
        }
    }

    

   @Override
public void onBackPressed( ) {
        int currPage =  mViewPager.getCurrentItem();
        WebView wv = null;
        switch (currPage) {
        case 0:
            wv = (WebView) mViewPager.getChildAt(currPage).findViewById(R.id.section_label);
            break;
        case 1:
            wv = (WebView) mViewPager.getChildAt(currPage).findViewById(R.id.section_label);
            break;
        case 2:
            wv = (WebView) mViewPager.getChildAt(currPage).findViewById(R.id.section_label);
            break;
        case 3:
            wv = (WebView) mViewPager.getChildAt(currPage).findViewById(R.id.section_label);
            break;
        case 4:
            wv = (WebView) mViewPager.getChildAt(currPage).findViewById(R.id.section_label);
            break;
        }

        if (wv != null) {
            if (wv.canGoBack()) {
                wv.goBack();
            } else {
                super.onBackPressed();
            }
        } else {
            super.onBackPressed();
       }
   }
   
	/**
     * A dummy fragment representing a section of the app, but that simply
     * displays dummy text.
     */
    public static class SectionFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        public static final String ARG_SECTION_NUMBER = "section_number";
        public static WebView webview; 


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main_dummy, container, false);
            webview = (WebView) rootView.findViewById(R.id.section_label);
            webview.getSettings().setJavaScriptEnabled(true); 
            
            switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 1:
            	webview.loadUrl("http://ixx.portal.ixianxia.com/");
            	break;
            case 2:
            	webview.loadUrl("http://ixx.portal.ixianxia.com/channel?c_id=6030605305940475906&nasid=5925993994391201035/");
                break;
            case 3:
            	webview.loadUrl("http://ixx.portal.ixianxia.com/channel?c_id=6014248966670123023&nasid=5925993994391201035/");
                break;
            case 4:
            	webview.loadUrl("http://ixx.portal.ixianxia.com/channel?c_id=6041313724560769068&nasid=5925993994391201035");
            case 5:
            	webview.loadUrl("http://ixx.portal.ixianxia.com/login?nasid=5925993994391201035/");
                break;
            }
            
            // setContentView(webview); 
            webview.setWebViewClient(new MyWebViewClient ());
            //TextView dummyTextView = (TextView) rootView.findViewById(R.id.section_label);
           // dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
           // dummyTextView.setText("Hello~Yvette~!!!");
            //HomepageActivity.onCreate(Integer.toString(getArguments());
        		
            return rootView;
        }
        

      //Web视图 
      private class MyWebViewClient extends WebViewClient { 
          @Override
          public boolean shouldOverrideUrlLoading(WebView view, String url) { 
               view.loadUrl(url); 
                return true; 
           } 
        } 
    }
    
}
