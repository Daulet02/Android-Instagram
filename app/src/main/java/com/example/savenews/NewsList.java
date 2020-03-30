package com.example.savenews;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewsList extends Fragment {

    RecyclerView recyclerView;
    private Adapter adapter;
    private Adapter.ItemClickListener listener;
    private Adapter.FragmentButtonListener fragmentButtonListener = null;
    private Adapter.FragmentLikeListener fragmentLikeListener = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater
                .inflate(R.layout.page, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        listener = new Adapter.ItemClickListener() {
            @Override
            public void ItemClick(int position, News item) {
                Intent intent = new Intent(getActivity(), NewsDetailActivity.class);
                intent.putExtra("news", item);
                startActivity(intent);
            }
        };
        fragmentButtonListener = new Adapter.FragmentButtonListener() {
            @Override
            public void myClick(News news, int option) {
                ((MainActivity) getActivity()).myClick(news, option);
            }
        };
        fragmentLikeListener = new Adapter.FragmentLikeListener() {
            @Override
            public void removeItemLike(News news) {
                ((MainActivity)getActivity()).removeItemLike(news);
            }
        };
        adapter = new Adapter(newsGenerator(), listener, fragmentButtonListener, fragmentLikeListener);
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    private List<News> newsGenerator(){
        List<News> items = new ArrayList<>();
        News news1 = new News(
                1,
                "Game arts",
                "June 14, 2019",
                R.drawable.profile10,
                27,
                R.drawable.post1,
                "Sekiro: \n" +
                        "Shadows die twice \n" +
                        "Game Of The Year 2019 \n" +
                        "It`s amazing !"
        );
        items.add(news1);
        News news2 = new News(
                2,
                "Game arts",
                "December 3, 2019",
                R.drawable.profile10,
                5402,
                R.drawable.post2,
                "Dark Souls 3"
        );
        items.add(news2);
        News news3 = new News(
                3,
                "Game arts",
                "May 15, 2019",
                R.drawable.profile10,
                21010,
                R.drawable.post3,
                "The Elder Scrolls: Online in Skyrim"
        );
        items.add(news3);
        News news4 = new News (
                4,
                "Game arts",
                "May 31, 2018",
                R.drawable.profile10,
                1396,
                R.drawable.post4,
                "The Elder Scrolls V: Skyrim "
        );
        items.add(news4);
        News news5 = new News (
                5,
                "Game arts",
                "April 29, 2019",
                R.drawable.profile10,
                11763,
                R.drawable.post5,
                "Dishonored II"
                );
        items.add(news5);
        News news6 = new News (
                6,
                "Game arts",
                "March 27, 2019",
                R.drawable.profile10,
                392352,
                R.drawable.post6,
                "Call of duty: Modern Warfare 2"
                );
        items.add(news6);
        News news7 = new News (
                7,
                "Game arts",
                "March 15, 2019",
                R.drawable.profile10,
                1596668,
                R.drawable.post7,
                "Call of duty: Black Ops"
        );
        items.add(news7);
        News news8 = new News(
                8,
                "Game arts",
                "November 20, 2018",
                R.drawable.profile10,
                181,
                R.drawable.post8,
                "Fallout: New Vegas"
        );
        items.add(news8);
        News news9 = new News (
                9,
                "Game arts",
                "January 3",
                R.drawable.profile10,
                8474,
                R.drawable.post9,
                "Fallout 4"
        );
        items.add(news9);
        News news10 = new News (
                10,
                "Game arts",
                "January 6",
                R.drawable.profile10,
                10716,
                R.drawable.post10,
                "Minecraft"
        );
        items.add(news10);
        News news11 = new News(
                11,
                "Game arts",
                "March 6",
                R.drawable.profile10,
                18857,
                R.drawable.post11,
                "Assasins Creed"
        );
        items.add(news11);
        News news12 = new News(
                12,
                "Game arts",
                "February 20",
                R.drawable.profile10,
                25809,
                R.drawable.post12,
                "Battlefield 3"
        );
        items.add(news12);
        News news13 = new News(
                13,
                "Game arts",
                "January 12",
                R.drawable.profile10,
                6792,
                R.drawable.post13,
                "God Of War"
        );
        items.add(news13);
        News news14 = new News(
                14,
                "Game arts",
                "January 12",
                R.drawable.profile10,
                7300,
                R.drawable.post14,
                "Bloodborne"
        );
        items.add(news14);
        News news15 = new News(
                15,
                "Game arts",
                "January 8",
                R.drawable.profile10,
                944583,
                R.drawable.post15,
                "Predator"
        );
        items.add(news15);
        News news16 = new News(
                16,
                "Game arts",
                "December 3, 2019",
                R.drawable.profile10,
                3016,
                R.drawable.post16,
                "Beautiful art for your desktop"
        );
        items.add(news16);
        News news17 = new News(
                17,
                "Game arts",
                "December 9, 2019",
                R.drawable.profile10,
                9393,
                R.drawable.post17,
                "Dead Space 2"
        );
        items.add(news17);
        News news18 = new News(
                18,
                "Game arts",
                "June 7, 2019",
                R.drawable.profile10,
                2260,
                R.drawable.post18,
                "The Walking Dead"
        );
        items.add(news18);
        News news19 = new News(
                19,
                "Game arts",
                "April 19, 2019",
                R.drawable.profile10,
                3003426,
                R.drawable.post19,
                "Nier: Automata amazing art for you"
        );
        items.add(news19);
        News news20 = new News(
                20,
                "Game arts",
                "December 23, 2018",
                R.drawable.profile10,
                5734,
                R.drawable.post20,
                "Nier: Automata"
        );
        items.add(news20);
        return items;
    }

    public void removeLike(News news){
        adapter.removeLike(news);
    }
}
