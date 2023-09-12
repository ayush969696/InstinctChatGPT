package com.myandayush.chatbot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {
    List<Message> messageList;
    public MessageAdapter(List<Message> messageList) {
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View chatView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(chatView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Message message = messageList.get(position);
        if (message.getSendBy().equals(Message.SENT_BY_ME)){
            holder.leftchatView.setVisibility(View.GONE);
            holder.rightchatView.setVisibility(View.VISIBLE);
            holder.rigtTextView.setText(message.getMesssage());
        }
        else {
            holder.leftchatView.setVisibility(View.VISIBLE);
            holder.rightchatView.setVisibility(View.GONE);
            holder.leftTextView.setText(message.getMesssage());
        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        LinearLayout leftchatView, rightchatView;
        TextView leftTextView, rigtTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            leftchatView = itemView.findViewById(R.id.left_charView);
            rightchatView = itemView.findViewById(R.id.right_charView);
            leftTextView = itemView.findViewById(R.id.left_chat_text_view);
            rigtTextView = itemView.findViewById(R.id.righ_chat_text_view);


        }
    }

}
