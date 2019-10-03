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

    public class FirstFragment extends Fragment {
        private static final String TITLE = "title"; // Наименования книги
        private static final String ID = "ID"; // Индивидуальный номер книги
        private static final String AUTHOR = "author"; // Автор книги
        private static final String YEAR = "year"; // Год издания книги
        private static final String COST = "cost"; // Стоимость книги
        private static final String NUMBER = "number"; // Кол-во книг
        private static final String HEADLINE_DESCRIPTION = "headline_description"; // Заголовок описания
        private static final String DESCRIPTION = "description"; // Описание
        private static final String ICON = "icon";  // Картинка

            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {
                View rootView = inflater.inflate(R.layout.fragment_first, container,
                        false);
                ListView lvMain = (ListView) rootView.findViewById(R.id.lvMain);

                // создаем массив списков
                ArrayList<HashMap<String, Object>> catList = new ArrayList<>();

                HashMap<String, Object> hashMap;

                hashMap = new HashMap<>(); // Наименования книги
                hashMap.put(TITLE, "Английский язык 11 класс");
                hashMap.put(ID, "ID: 85478"); // Индивидуальный номер книги
                hashMap.put(AUTHOR, "Автор: Афанасьева О.В."); // Автор книги
                hashMap.put(YEAR, "Год издания: 2010г"); // Год издания книги
                hashMap.put(COST, "Ценность: 315 руб."); // Стоимость книги
                hashMap.put(NUMBER, "Кол-во: 24"); // Кол-во книг
                hashMap.put(HEADLINE_DESCRIPTION, "Описание"); // Описание
                hashMap.put(DESCRIPTION, "Предлагаем вашему вниманию рабочую \nтетрадь по английскому языку для учащихся 11 класса общеобразовательных учреждений и школ с углубленным изучением английского языка.\n"); // Заголовок описания
                hashMap.put(ICON, R.drawable.eng); // Картинка
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Алгебра 10-11 классы");
                hashMap.put(ID, "ID: 89745");
                hashMap.put(AUTHOR, "Автор: Мордкович А.Г.");
                hashMap.put(YEAR, "Год издания: 2014г");
                hashMap.put(COST, "Ценность: 210 руб.");
                hashMap.put(NUMBER, "Кол-во: 45");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Учебник дает цельное и полное представление о школьном курсе алгебры и начал математического анализа. Отличительные особенности учебника — более доступное для школьников изложение материала по сравнению с традиционными учебными пособиями, наличие большого числа примеров с подробными решениями. Построение всего курса осуществляется на основе приоритетности функционально-графической линии.\n");
                hashMap.put(ICON, R.drawable.algebra);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Алгебра 9 класс");
                hashMap.put(ID, "ID: 89744");
                hashMap.put(AUTHOR, "Автор: Макарычев Ю.Н.");
                hashMap.put(YEAR, "Год издания: 2018г");
                hashMap.put(COST, "Ценность: 350 руб.");
                hashMap.put(NUMBER, "Кол-во: 23");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Данное учебное пособие предназначено для углублённого изучения алгебры в 9 классе и является третьим в линии учебных пособий: «Алгебра. 7 класс», «Алгебра. 8 класс» и «Алгебра. 9 класс». Его содержание подготовлено в соответствии с требованиями Федерального государственного образовательного стандарта основного общего образования. Особенностями пособия являются расширение и углубление традиционных учебных тем за счёт теоретико-множественной, вероятностно-статистической и историко-культурной линий. Пособие содержит большое количество разнообразных по тематике и уровню сложности упражнений.\n");
                hashMap.put(ICON, R.drawable.alg);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Биология 11 класс");
                hashMap.put(ID, "ID: 58465");
                hashMap.put(AUTHOR, "Автор: Сивоглазов В.И.");
                hashMap.put(YEAR, "Год издания: 2010г");
                hashMap.put(COST, "Ценность: 457 руб.");
                hashMap.put(NUMBER, "Кол-во: 59");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Учебник соответствует базовому уровню Федерального компонента государственного стандарта общего образования по биологии и рекомендован Министерством образования и науки РФ.\n" +
                        "Учебник адресован учащимся 10-11 классов общеобразовательных учреждений и завершает линию Н.И. Сонина. Однако особенности изложения материала позволяют использовать его на завершающем этапе изучения биологии после учебников всех существующих линий.\n");
                hashMap.put(ICON, R.drawable.bio);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Биология 9 класс");
                hashMap.put(ID, "ID: 58464");
                hashMap.put(AUTHOR, "Автор: Вахрушев А.А.");
                hashMap.put(YEAR, "Год издания: 2015г");
                hashMap.put(COST, "Ценность: 745 руб.");
                hashMap.put(NUMBER, "Кол-во: 12");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Учебник для 9 класса знакомит учащихся с общими закономерностями живой природы. Отличительная черта учебника - рассмотрение явления регуляции и её роли в поддержании постоянства свойств живого на всех уровнях организации. Методический аппарат учебника ориентирован на проблемно-диалогическую технологию. Множество иллюстраций, схем, афористичные названия параграфов и рубрик создают мотивацию к обучению.\n");
                hashMap.put(ICON, R.drawable.bii);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "География 10-11 классы");
                hashMap.put(ID, "ID: 65423");
                hashMap.put(AUTHOR, "Автор: Максаковский В.П.");
                hashMap.put(YEAR, "Год издания: 2012г");
                hashMap.put(COST, "Ценность: 451 руб.");
                hashMap.put(NUMBER, "Кол-во: 10");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Этот учебник по праву можно назвать учебником нового поколения, поскольку он учитывает не только богатый отечественный, но и мировой опыт создания школьных учебников географии, что нашло отражение в его научном содержании, методическом аппарате и самой модели книги.\n");
                hashMap.put(ICON, R.drawable.geo);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Геометрия 10-11 классы");
                hashMap.put(ID, "ID: 52136");
                hashMap.put(AUTHOR, "Автор: Атанасян Л.С.");
                hashMap.put(YEAR, "Год издания: 2013г");
                hashMap.put(COST, "Ценность: 123 руб.");
                hashMap.put(NUMBER, "Кол-во: 62");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Школьный курс геометрии состоит из двух частей: планиметрии (7-9 классы) и стереометрии (10-11 классы). В планиметрии изучаются свойства геометрических фигур на плоскости. Стереометрия - это раздел геометрии, в котором изучаются свойства фигур в пространстве. В данное издание внесены существенные дополнения, большая часть которых является необязательной для базового уровня.\n");
                hashMap.put(ICON, R.drawable.geom);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Гордость и предубеждение");
                hashMap.put(ID, "ID: 56485");
                hashMap.put(AUTHOR, "Автор: Джейн Остен");
                hashMap.put(YEAR, "Год издания: 2018г");
                hashMap.put(COST, "Ценность: 217 руб.");
                hashMap.put(NUMBER, "Кол-во: 5");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Мистер Дарси - главный герой романа - стал для многих читательниц эталоном мужчины, благородный аристократ, который закрывает глаза на сословные предрассудки и женится по любви на женщине, стоящей гораздо ниже его по положению. На Элизабет Беннет, гордой, неприступной девушке, умной, начитанной и глубоко чувствующей.\n" +
                        "Несколько экранизаций, два сериала и армия поклонников по всему миру навеки вписали роман \"Гордость и предубеждение\" в летопись лучших историй о любви, побеждающей любые преграды.\n");
                hashMap.put(ICON, R.drawable.go);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Женщина в белом");
                hashMap.put(ID, "ID: 14596");
                hashMap.put(AUTHOR, "Автор: Уилки Коллинз");
                hashMap.put(YEAR, "Год издания: 2019г");
                hashMap.put(COST, "Ценность: 143 руб.");
                hashMap.put(NUMBER, "Кол-во: 9");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Жизнь начинающего художника Уолтера Хартрайта, получившего в уединенном имении необременительную должность учителя рисования, навеки изменилась после встречи с таинственной молодой незнакомкой, одетой в белое…\n" +
                        "Кто она? Почему так отчаянно проклинает какого-то баронета? Что за всадники скачут по ее следу? И наконец, почему она похожа на одну из учениц Уолтера, словно сестра-близнец?\n");
                hashMap.put(ICON, R.drawable.g);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "История 11 класс");
                hashMap.put(ID, "ID: 65823");
                hashMap.put(AUTHOR, "Автор: Ладыченко Т.В.");
                hashMap.put(YEAR, "Год издания: 2011г");
                hashMap.put(COST, "Ценность: 523 руб.");
                hashMap.put(NUMBER, "Кол-во: 12");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Учебник «Всемирная история» для 11-го класса составлен в соответствии с требованиями Государственного стандарта образования и действующей программой для общеобразовательных учебных заведений.\n");
                hashMap.put(ICON, R.drawable.his);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Книжный вор");
                hashMap.put(ID, "ID: 17566");
                hashMap.put(AUTHOR, "Автор: Маркус Зусак");
                hashMap.put(YEAR, "Год издания: 2018г");
                hashMap.put(COST, "Ценность: 176 руб.");
                hashMap.put(NUMBER, "Кол-во: 7");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Январь 1939 года. Германия. Страна, затаившая дыхание. Никогда еще у смерти не было столько работы. А будет еще больше. Мать везет девятилетнюю Лизель Мемингер и ее младшего брата к приемным родителям под Мюнхен, потому что их отца больше нет - его унесло дыханием чужого и странного слова \"коммунист\", и в глазах матери девочка видит страх перед такой же судьбой.\n");
                hashMap.put(ICON, R.drawable.k);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Лабиринты Ехо");
                hashMap.put(ID, "ID: 14585");
                hashMap.put(AUTHOR, "Автор: Макс Фрай");
                hashMap.put(YEAR, "Год издания: 2015г");
                hashMap.put(COST, "Ценность: 1788 руб.");
                hashMap.put(NUMBER, "Кол-во: 3");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Самые лучшие книги от одного из самых известных авторов современности - Макса Фрая!\n" +
                        "\"Чужак\", \"Волонтеры вечности\", \"Простые волшебные вещи\", \"Темная сторона\" и \"Наваждения\" - теперь под одной обложкой!\n" +
                        "Увлекательнейшие \"Лабиринты Ехо\" - цикл историй про сэра Макса его друзей, недругов и союзников - сегодня уже классика жанра.\n" +
                        "Вселенная, центром которой и является Ехо, сейчас известна всем ценителям хорошей литературы!\n");
                hashMap.put(ICON, R.drawable.lab);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Литература 11 класс");
                hashMap.put(ID, "ID: 45236");
                hashMap.put(AUTHOR, "Автор: Смирнова Л.А.");
                hashMap.put(YEAR, "Год издания: 2012г");
                hashMap.put(COST, "Ценность: 124 руб.");
                hashMap.put(NUMBER, "Кол-во: 29");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Если вы хотите познакомиться с новым взглядом на отечественную литературу XX столетия, если вас интересуют драматические судьбы крупнейших русских писателей нашего века, если вам необходима книга, написанная научно, содержательно и одновременно увлекательно коллективом ведущих писателей, литературоведов, критиков, то такая книга перед вами - это учебник по русской литературе XX века. Внимательно прочитав его, вы сможете самостоятельно подготовиться к выпускным экзаменам в школе и к вступительным экзаменам в вузы. Книга включена в Федеральный перечень учебников и учебных пособий, рекомендованных Министерством общего и профессионального образования Российской Федерации. Предыдущие издания выходили под названием «Русская литература XX века».\n");
                hashMap.put(ICON, R.drawable.lit);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Милый друг");
                hashMap.put(ID, "ID: 96541");
                hashMap.put(AUTHOR, "Автор: Ги Мопассан");
                hashMap.put(YEAR, "Год издания: 2018г");
                hashMap.put(COST, "Ценность: 118 руб.");
                hashMap.put(NUMBER, "Кол-во: 10");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "\"Милый друг\" (1885) - один из самых известных и часто экранизируемых романов Мопассана. Время идет, но читателям по-прежнему интересен образ циничного авантюриста и ловеласа Жоржа Дюруа, обольстителя светских красавиц, не брезгующего ничем, чтобы пробиться из нищеты и безвестности в высшее общество. Не обладая особыми талантами, кроме умения соблазнять женщин, герой умудряется, правда, не без труда, добиться всего, чего хочет.\n");
                hashMap.put(ICON, R.drawable.m);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Русский язык 10-11 классы");
                hashMap.put(ID, "ID: 56487");
                hashMap.put(AUTHOR, "Автор: Гольцова Н.Г.");
                hashMap.put(YEAR, "Год издания: 2010г");
                hashMap.put(COST, "Ценность: 245 руб.");
                hashMap.put(NUMBER, "Кол-во: 23");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "В книге представлены трудные вопросы русской морфологии, излагаются спорные вопросы грамматики русского языка, рассматриваются взаимосвязь грамматики и семантики, морфологии и стилистики, варианты грамматических форм.\n" +
                        "Книга адресована учащимся старших классов, учителям, абитуриентам, студентам-филологам и всем, кто интересуется языкознанием.\n");
                hashMap.put(ICON, R.drawable.russ);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Обществознание 11 класс");
                hashMap.put(ID, "ID: 56123");
                hashMap.put(AUTHOR, "Автор: Боголюбов Л.Н.");
                hashMap.put(YEAR, "Год издания: 2010г");
                hashMap.put(COST, "Ценность: 236 руб.");
                hashMap.put(NUMBER, "Кол-во: 312");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "В сборник включены программы по обществознанию и праву, созданные в соответствии с федеральным компонентом Государственного стандарта общего образования. Программы ориентированы на учебники по курсу «Обществознание», выпускаемые издательством «Просвещение», но могут быть использованы и при работе с другими учебниками по данному курсу.\n");
                hashMap.put(ICON, R.drawable.ob);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "ОБЖ 11 класс");
                hashMap.put(ID, "ID: 56489");
                hashMap.put(AUTHOR, "Автор: Смирнов А.Т.");
                hashMap.put(YEAR, "Год издания: 2014г");
                hashMap.put(COST, "Ценность: 236 руб.");
                hashMap.put(NUMBER, "Кол-во: 36");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Учебник разработан в соответствии с Федеральным государственным образовательным стандартом среднего общего образования с учётом комплексного подхода к формированию у обучаемых современного уровня культуры безопасности и подготовки их к военной службе при модульной структуре содержания курса ОБЖ (три модуля, семь разделов).\n");
                hashMap.put(ICON, R.drawable.ooob);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Физика 11 класс");
                hashMap.put(ID, "ID: 25696");
                hashMap.put(AUTHOR, "Автор: Мякишев Г.Я.");
                hashMap.put(YEAR, "Год издания: 2010г");
                hashMap.put(COST, "Ценность: 235 руб.");
                hashMap.put(NUMBER, "Кол-во: 32");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Материал учебника, завершающего предметную линию «Классический курс», даёт представление о современной физике: теории относительности, квантовой теории, физике атомного ядра и элементарных частиц, строении Вселенной. Учебный материал содержит информацию, расширяющую кругозор учащегося; темы докладов на семинарах, интернет-конференциях; ключевые слова, несущие главную смысловую нагрузку по изложенной теме; образцы заданий ЕГЭ.\n");
                hashMap.put(ICON, R.drawable.pis);
                catList.add(hashMap);

                hashMap = new HashMap<>();
                hashMap.put(TITLE, "Химия 11 класс");
                hashMap.put(ID, "ID: 56289");
                hashMap.put(AUTHOR, "Автор: Габриелян О.С.");
                hashMap.put(YEAR, "Год издания: 2010г");
                hashMap.put(COST, "Ценность: 753 руб.");
                hashMap.put(NUMBER, "Кол-во: 22");
                hashMap.put(HEADLINE_DESCRIPTION, "Описание");
                hashMap.put(DESCRIPTION, "Учебник продолжает курс химии для старшей школы, изложенный в учебнике О.С.Габриеляна «Химия. 10 класс. Базовый уровень». Он может быть использован при изучении курса общей химии базового уровня. Учебник соответствует Федеральному государственному образовательному стандарту среднего (полного) общего образования.\n");
                hashMap.put(ICON, R.drawable.him);
                catList.add(hashMap);

                SimpleAdapter adapter = new SimpleAdapter ( getActivity(), catList,
                        R.layout.list_item, new String[]{TITLE,  ID, AUTHOR, YEAR, COST, NUMBER, HEADLINE_DESCRIPTION, DESCRIPTION, ICON},
                        new int[]{R.id.title, R.id.ID, R.id.author, R.id.year, R.id.cost, R.id.number, R.id.headline_description, R.id.description, R.id.imageview_icon});

                // Устанавливаем адаптер для списка
                lvMain.setAdapter(adapter);
                return rootView;
            }

    }