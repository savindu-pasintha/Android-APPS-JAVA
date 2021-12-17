package spl.support.layoutdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import spl.support.layoutdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ClickHandler clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.setContact(new Contact("FN","LN"));

        clickHandler=new ClickHandler(this);
        mainBinding.content.setClickHandler(clickHandler);
    }
    public class ClickHandler{
        private Context context;
        public ClickHandler(Context context){ this.context=context;}

        public void getValueClick(View view){
        Toast.makeText(context, "click method : ", Toast.LENGTH_LONG).show();
        }

        public void getValueLongClick(View view){
            Toast.makeText(context, "Long click method : ", Toast.LENGTH_LONG).show();
        }
    /*   public void getValueLongClickWithParameter(View view,Contact cObj){
            if (view.getId() == R.id.button3) {
                Toast.makeText(context, "get click with parameeter : " + cObj.firstName + "-" + cObj.lastName, Toast.LENGTH_LONG).show();
            }
        }

     */

}

}