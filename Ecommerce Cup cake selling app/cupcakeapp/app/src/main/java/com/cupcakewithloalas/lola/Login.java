package com.cupcakewithloalas.lola;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.cupcakewithloalas.lola.R;

public class Login extends AppCompatActivity {

    //define ui componets id names as a variable
    EditText usernamevalue,passwordvalue;
    TextView lblname,lblpass,lbl_error;
    Button btnLogin ,showHiddenBtn;
    CheckBox ck;
    DB_Operation db;
    userModel dbuse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//
        db=new DB_Operation(this);
        //
        //input feilds id values access
        usernamevalue=(EditText)findViewById(R.id.username);
        passwordvalue=(EditText)findViewById(R.id.password);
        btnLogin=(Button) findViewById(R.id.login_btn);
       // showHiddenBtn=(Button) findViewById(R.id.showHiddenBtn);
        ck=(CheckBox) findViewById(R.id.checkBox);
         // lblname = (TextView) findViewById(R.id.lblname);
         // lblpass = (TextView) findViewById(R.id.lblpass);
        lbl_error=(TextView)findViewById(R.id.lbl_error);
        
        //text watcher class


        /*
        usernamevalue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (!usernamevalue.getText().toString().isEmpty() && !passwordvalue.getText().toString().isEmpty()) {
                    btnLogin.setEnabled(true);
                } else {
                    btnLogin.setEnabled(false);
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        passwordvalue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!usernamevalue.getText().toString().isEmpty() && !passwordvalue.getText().toString().isEmpty()){
                    btnLogin.setEnabled(true);
                }else{
                    btnLogin.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        */
    }

    public void showHidePassword(View view){
        /*
        ck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    passwordvalue.setTransformationMethod(null);
                }else{
                    passwordvalue.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
        */

            if(ck.isChecked()){
                passwordvalue.setTransformationMethod(null);
            } else{
                passwordvalue.setTransformationMethod(new PasswordTransformationMethod());

            }
        }


    public void login_btn_click(View view){

        String u="user";
        String p="1234";

        //text feild values get
        String user = usernamevalue.getText().toString();
        String pass = passwordvalue.getText().toString();

        //put valuse to obg useMOdel
        // userModel dbuse=new userModel();

        /*
       dbuse.setName(user);
       dbuse.setPass(pass);
        */
        try{
            //database user data put and assign to variables
           //  db=new DB_Operation(this);

            //userModel use = new userModel();
         /*
            ArrayList<userModel> usermodelList=db.findUser(dbuse);
            String un=usermodelList.get(0).getName();
            String ps=usermodelList.get(0).getPass();
        */

            // alertMethod("Login Successfully."+user+pass);

            //Toast.makeText(getApplicationContext(),"Values"+ps, Toast.LENGTH_LONG).show();

            //progerss loading

            final ProgressDialog pd = new ProgressDialog(Login.this);
            pd.setTitle("Login");
            pd.setMessage("Authenticating...");
            pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            pd.show();

            //asyncronous method ekk time out set kenn
            new android.os.Handler().postDelayed(new Runnable() {@Override public void run()
            { pd.dismiss();
               /*
                if((user.equalsIgnoreCase(u) || un.equalsIgnoreCase(user)) && (p.equals(pass)) || pass.equalsIgnoreCase(ps)){
                    alertMethod("Login Successfully.");
                    clear();// claer the  the text feils
                    //go to new xml
                    Intent objc = new Intent(Login.this,Products.class);
                    startActivity(objc);
                }*/
            if(user.equals(u) && pass.equals(p)){

                alertMethod("Login Successfully.");
                clear();// claer the  the text feils

                //go to new xml
                Intent objc = new Intent(Login.this,Products.class);
                startActivity(objc);

            }else if((user.equalsIgnoreCase("admin")  && pass.equalsIgnoreCase("1234")))
                {

                    alertMethod("Login Successfully to Admin panel.");
                    clear();// claer the  the text feils

                    //go to new xml
                    Intent objc = new Intent(Login.this,ProductManage.class);
                    startActivity(objc);

                }else{
                // alertMethod("Login failed !.");
                lbl_error.setText("password length should be 8 or not match !");
            }




            }},2000);


        }catch(Exception e){

            Toast.makeText(getApplicationContext(), e.getMessage().toString(), Toast.LENGTH_LONG).show();

            Log.i("error in Login",e.getMessage());
           // clear();
            alertMethod(e.getMessage());

        }


    }

    public void gotoSignup(View view){
        Intent obj = new Intent(Login.this,Signup.class);
        startActivity(obj);
    }

    public void alertMethod(String msg){
        //1-builder to a set alert values
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("");
        alertDialogBuilder.setMessage(msg);
        //alertDialogBuilder.setMessage("Login successfully.");

        //2- execute alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void clear(){
        usernamevalue.setText(null);
        passwordvalue.setText(null);
        lbl_error.setText(null);

    }

}