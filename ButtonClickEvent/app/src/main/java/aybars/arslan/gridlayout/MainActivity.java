package aybars.arslan.gridlayout;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Xml'de olusturdugumuz butonumuzu java dosyamizla iliskilendirdik.
        Button btnAybars = (Button)findViewById(R.id.btnAybars);

        //btnAybars isimli butonu dinlemeye aldık. Uygulama boyunca buton dinlenicek
        btnAybars.setOnClickListener(
            //Butona tıklandiginda asagidaki fonksiyonumuz cagrilacak
            new Button.OnClickListener(){
                public void onClick(View v){
                    TextView tvAybars = (TextView)findViewById(R.id.tvAybars);
                    tvAybars.setText("Good Click !!");
                }
            }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
