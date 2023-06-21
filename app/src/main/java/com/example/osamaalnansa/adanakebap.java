package com.example.osamaalnansa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class adanakebap extends AppCompatActivity {
    TextView kebp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Adana Kebap");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_adanakebap);
        kebp = (TextView) findViewById(R.id.kebp);
        kebp.setText("3.ADANA’DAKİ ÜNLÜ YEMEKLER\n" +
                "3.1Adana Kebap\n" +
                "Adana kebabı, şehrin adını en çok duyurduğu bugün ülkemizin dört bir yanında\n" +
                "restoranlarda Adana dürüm, Adana kebap olarak menülere giren lezzetidir.\n" +
                "Adana’nın meşhur lezzeti Adana kebabını her yerde deneyimleyebilirsiniz ancak\n" +
                "gerçek anlamda bir Adana kebap yemek isterseniz rotanızı kebabın ana vatanı olan\n" +
                "Adana’ya yöneltmelisiniz. Adana’nın dürümcülerinde ve restoranlarında kolayca\n" +
                "bulabileceğiniz Adana kebap acılı ve acısız seçenekleri ile müşterilere sunuluyor.\n" +
                "Adana kebap yapılırken kullanılan dana kıyma ve kuzu kıyma, baharatlar ve tabi ki\n" +
                "yöresel salça, tarifi ana vatanında deneyimleyenlerin çok daha leziz bulmasının\n" +
                "nedenleri arasında yer alıyor. Birçokları tarafından evlerde dahi denenen Adana\n" +
                "kebap asıl olarak yapılırken birçok püf noktası bulunan bir lezzet. Bu nedenle de\n" +
                "gerçek bir Adana usulü kebap yemek isterseniz yine gitmeniz gereken yer Adana\n" +
                "olacaktır. Yöresel lezzetlerinden tutun da salçasının tadına kadar özgünlük kokan bu\n" +
                "şehirde Adana kebap yemeye doyamayabilirsiniz.");
    }
}