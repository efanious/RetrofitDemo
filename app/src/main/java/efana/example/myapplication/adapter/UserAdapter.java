package efana.example.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

import efana.example.myapplication.R;
import efana.example.myapplication.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;
    private Context context;

    public UserAdapter(Context context, List<User> userList) {
        this.userList = userList;
        this.context = context;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView userName;
        TextView fullName;


        public UserViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            userName = mView.findViewById(R.id.username);
            fullName = mView.findViewById(R.id.full_name);
        }
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.user_row, parent, false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder (UserViewHolder holder, int position) {
        holder.userName.setText(userList.get(position).getUsername());
        holder.fullName.setText(userList.get(position).getName());



    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


}
