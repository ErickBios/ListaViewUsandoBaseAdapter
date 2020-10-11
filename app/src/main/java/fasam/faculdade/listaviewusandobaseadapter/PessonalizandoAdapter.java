package fasam.faculdade.listaviewusandobaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class PessonalizandoAdapter extends BaseAdapter{

        Context context;

        static LayoutInflater inflater = null;

        int incons[];

        String number[];


        PessonalizandoAdapter(Context context, int incons[], String number[]){

        this.context = context;
        this.incons = incons;
        this.number = number;

    }

    @Override
    public int getCount() {
        return number.length;
    }

    @Override
    public Object getItem(int position) {
        return getItemId(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View lista = convertView;
        if(lista == null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


            lista = inflater.inflate(R.layout.linhas_lista, null);
        }

        ImageView img = (ImageView) lista.findViewById(R.id.imageView);
        TextView tv = (TextView) lista.findViewById(R.id.textView);
        img.setImageResource(incons[position]);
        tv.setText(number[position]);


        return lista;
    }
}
