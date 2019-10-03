package com.example.myapplication5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class SecondFragment extends Fragment {
    private static final String TITLE = "title"; // Наименования книги
    private static final String ID = "ID"; // Индивидуальный номер книги
    private static final String AUTHOR = "author"; // Автор книги
    private static final String YEAR = "year"; // Год издания книги
    private static final String COST = "cost"; // Стоимость книги
    private static final String DATE0 = "date0"; // Дата выдачи
    private static final String DATE = "date"; // Дата возврата
    private static final String ICON = "icon";  // Картинка

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_second, container,
                false);
        ListView lvMain = (ListView) rootView.findViewById(R.id.lvMain);

        // создаем массив списков
        ArrayList<HashMap<String, Object>> catList = new ArrayList<>();

        HashMap<String, Object> hashMap;

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Алгебра 10-11 классы"); // Наименования книги
        hashMap.put(ID, "ID: 89745"); // Индивидуальный номер книги
        hashMap.put(AUTHOR, "Автор: Мордкович А.Г."); // Автор книги
        hashMap.put(YEAR, "Год издания: 2014г"); // Год издания книги
        hashMap.put(COST, "Ценность: 210 руб."); // Стоимость книги
        hashMap.put(DATE0, "Дата выдачи: 31.08.18"); // Дата выдачи
        hashMap.put(DATE, "Дата возврата: 31.05.19"); // Дата возврата
                hashMap.put(ICON, R.drawable.algebra); // Картинка
        catList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Геометрия 10-11 классы");
        hashMap.put(ID, "ID: 52136");
        hashMap.put(AUTHOR, "Автор: Атанасян Л.С.");
        hashMap.put(YEAR, "Год издания: 2013г");
        hashMap.put(COST, "Ценность: 123 руб.");
        hashMap.put(DATE0, "Дата выдачи: 31.08.18");
        hashMap.put(DATE, "Дата возврата: 31.05.19");
        hashMap.put(ICON, R.drawable.geom);
        catList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Женщина в белом");
        hashMap.put(ID, "ID: 14596");
        hashMap.put(AUTHOR, "Автор: Уилки Коллинз");
        hashMap.put(YEAR, "Год издания: 2019г");
        hashMap.put(COST, "Ценность: 143 руб.");
        hashMap.put(DATE0, "Дата выдачи: 05.10.18");
        hashMap.put(DATE, "Дата возврата: 05.11.18");
        hashMap.put(ICON, R.drawable.g);
        catList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Литература 11 класс");
        hashMap.put(ID, "ID: 45236");
        hashMap.put(AUTHOR, "Автор: Смирнова Л.А.");
        hashMap.put(YEAR, "Год издания: 2012г");
        hashMap.put(COST, "Ценность: 124 руб.");
        hashMap.put(DATE0, "Дата выдачи: 31.08.18");
        hashMap.put(DATE, "Дата возврата: 31.05.19");
        hashMap.put(ICON, R.drawable.lit);
        catList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Русский язык 10-11 классы");
        hashMap.put(ID, "ID: 56487");
        hashMap.put(AUTHOR, "Автор: Гольцова Н.Г.");
        hashMap.put(YEAR, "Год издания: 2010г");
        hashMap.put(COST, "Ценность: 245 руб.");
        hashMap.put(DATE0, "Дата выдачи: 31.08.18");
        hashMap.put(DATE, "Дата возврата: 31.05.19");
        hashMap.put(ICON, R.drawable.russ);
        catList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put(TITLE, "Химия 11 класс");
        hashMap.put(ID, "ID: 56289");
        hashMap.put(AUTHOR, "Автор: Габриелян О.С.");
        hashMap.put(YEAR, "Год издания: 2010г");
        hashMap.put(COST, "Ценность: 753 руб.");
        hashMap.put(DATE0, "Дата выдачи: 31.08.18");
        hashMap.put(DATE, "Дата возврата: 31.05.19");
        hashMap.put(ICON, R.drawable.him);
        catList.add(hashMap);

        SimpleAdapter adapter = new SimpleAdapter ( getActivity(), catList,
                R.layout.list_item2, new String[]{TITLE,  ID, AUTHOR, YEAR, COST, DATE0, DATE, ICON},
                new int[]{R.id.title, R.id.ID, R.id.author, R.id.year, R.id.cost, R.id.date0, R.id.date, R.id.imageview_icon});

        // Устанавливаем адаптер для списка
        lvMain.setAdapter(adapter);
        return rootView;
    }

}