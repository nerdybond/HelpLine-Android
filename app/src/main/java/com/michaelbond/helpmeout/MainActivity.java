package com.michaelbond.helpmeout;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.navigation.NavigationView;


// MainActivity class
public class MainActivity extends AppCompatActivity {

    private static final long REFRESH_DELAY = 0;
    private AppBarConfiguration mAppBarConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sets toolbar and navigation drawer within the app
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_twentyfour, R.id.nav_crisis, R.id.nav_trauma, R.id.nav_depression, R.id.nav_women, R.id.nav_states)
                .setDrawerLayout(drawer)
                .build();

        //NavigationHost/Navigation Controller initialization - this is the section which keeps crashing the app at the moment. Trying to figure out the exact problem.
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_container);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);




        /*
        // Method to make toolbar blur. Will need to change appBar to refer to another Id, as this currently crashes app.

        final AppBarLayout appBar = findViewById(R.id.nav_home);
        final RealtimeBlurView blurView = findViewById(R.id.blurView);
        blurView.setAlpha(1F);
        appBar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(final AppBarLayout appBarLayout, final int verticalOffset) {
                float offsetAlpha = (appBarLayout.getY() / appBar.getTotalScrollRange());
                blurView.setAlpha(offsetAlpha * -1);
            }
        });


    //TEMP: Following tutorial - Triggers notification from button press.
        //TO-DO: Change this to trigger at specific dates
        createNotificationChannel();

        Button button = findViewById(R.id.twentyfourButtonOne);

        button.setOnClickListener(v -> {

            // Call to create notification once button is pressed
            //TO-DO: Change this to trigger at specific dates

            Toast.makeText(context: this, text:"Reminder Set!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(packageContext: MainActivity.this,ReminderBroadcast.class);
            PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
            // I choose 3s after the launch of my application
            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

            long timeAtButtonClick = System.currentTimeMillis();
            long tenSecondsInMillis = 1000 * 10;

            alarmManager.set(AlarmManager.RTC_WAKEUP,
                    triggerAtMillis: timeAtButtonClick + tenSecondsInMillis, pendingIntent);
        });
*/


        }
/*
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_container);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
*/
    /* Class to declare notifications within the app.
    class Receiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, intent.getStringExtra("param"), Toast.LENGTH_SHORT).show();


            // Notification Manager - Sends a notification at a specific time (TO-DO: Change to A specific time AND set multiple notifications for different days.)
            AlarmManager alarm = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);

            Receiver receiver = new Receiver();
            IntentFilter filter = new IntentFilter("ALARM_ACTION");
            registerReceiver(receiver, filter);

            Intent intent = new Intent("michael.bond.action.DISPLAY_NOTIFICATION");
            intent.putExtra("param", "My scheduled action");
            PendingIntent operation = PendingIntent.getBroadcast(this, 0, intent, 0);
            // I choose 3s after the launch of my application
            alarm.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 3000, operation);
        }
    }
    */

    private void createNotificationChannel(){

    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
        CharSequence name = "MichaelReminderChannel";
        String description = "Channel for Michael Reminder";
        int importance = NotificationManager.IMPORTANCE_DEFAULT;
        String id = "notifyMichael";
        NotificationChannel channel = new NotificationChannel(id, name, importance);
        channel.setDescription(description);

        NotificationManager notificationManager = getSystemService(NotificationManager.class);
        notificationManager.createNotificationChannel(channel);
    }
}



}
