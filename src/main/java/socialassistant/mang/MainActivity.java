package socialassistant.mang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String Text = "http://www.mgtv.com/v/2/104817/f/3379106.html";
    private String vid = null;//视频vid
    private String url = "http://v.api.mgtv.com/player/video?retry=1&video_id=";
    private EditText editText;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText) findViewById(R.id.Tvurl);
        //Text=editText.getText().toString();
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("".equals(Text.trim())||Text==null){
                    Toast.makeText(MainActivity.this,"请输入播放链接",Toast.LENGTH_SHORT).show();
                }else {
                    vid=Text.substring((Text.lastIndexOf("/")+1),Text.lastIndexOf("."));
                    url=url+vid;
                    Toast.makeText(MainActivity.this,url,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
