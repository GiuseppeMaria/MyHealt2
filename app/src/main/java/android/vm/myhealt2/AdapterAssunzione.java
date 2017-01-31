package android.vm.myhealt2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Francesco on 27/01/2017.
 */

public class AdapterAssunzione extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    List<Assunzione> dataSet= new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_medicine,parent,false);

        return new MedicineViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MedicineViewHolder viewHolder= (MedicineViewHolder) holder;
        viewHolder.medicinale.setText((CharSequence) dataSet.get(position).getName());
        viewHolder.date.setText((CharSequence) dataSet.get(position).getData()) ;
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public void setDataSet(List<Assunzione> dataSet) {
        this.dataSet = dataSet;
        notifyDataSetChanged();
    }

    public void addElementDataSet(Assunzione assunzione){
        this.dataSet.add(assunzione);
    }

    private class MedicineViewHolder extends RecyclerView.ViewHolder {
        TextView medicinale, date;

        public MedicineViewHolder(View v) {
            super(v);

            medicinale = (TextView) v.findViewById(R.id.medicinale);
            date = (TextView) v.findViewById(R.id.data);

        }
    }

}
