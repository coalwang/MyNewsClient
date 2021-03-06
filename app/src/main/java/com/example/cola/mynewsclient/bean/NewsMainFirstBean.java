package com.example.cola.mynewsclient.bean;

import java.util.List;

/**
 * Created by Cola on 2017/8/15.
 */

public class NewsMainFirstBean {

    /**
     * date : 20170815
     * stories : [{"title":"哆啦 A 梦开心地说：「日本战败了」","ga_prefix":"081519","images":["https://pic4.zhimg.com/v2-13119c828931783b17da482e7a6488c3.jpg"],"multipic":true,"type":0,"id":9572302},{"images":["https://pic1.zhimg.com/v2-0c75887e44b8c21d52a33c8bda70f81c.jpg"],"type":0,"id":9571033,"ga_prefix":"081518","title":"听说欧美的 IT 公司都不加班，羡慕，但又觉得不可思议"},{"title":"「小伙子，这些照片是你用手机拍出来的？」","ga_prefix":"081517","images":["https://pic2.zhimg.com/v2-755af5ae7711bdc503f196b8972762b5.jpg"],"multipic":true,"type":0,"id":9572180},{"images":["https://pic4.zhimg.com/v2-92cab5c5fc691e2b3ce76f57b08d98cb.jpg"],"type":0,"id":9571760,"ga_prefix":"081516","title":"被老师扇了耳光，学生当场猛扇回去该不该？"},{"images":["https://pic4.zhimg.com/v2-9d6b8155e879b7484a74402ecc948e6f.jpg"],"type":0,"id":9572187,"ga_prefix":"081515","title":"香港的经济出了哪些问题？"},{"images":["https://pic2.zhimg.com/v2-084c96393a85d1837c77ee75f51986ed.jpg"],"type":0,"id":9570487,"ga_prefix":"081514","title":"哪些我们以为违法的事其实是合法的？"},{"images":["https://pic2.zhimg.com/v2-2fb45f9b523c06d2db6826125a8d5165.jpg"],"type":0,"id":9571767,"ga_prefix":"081513","title":"有个大胆的想法，能不能用核弹「改造」一下火星？"},{"images":["https://pic2.zhimg.com/v2-947cf89079d5941e091e03c948a6a8b5.jpg"],"type":0,"id":9560732,"ga_prefix":"081512","title":"大误 · Siri 黑化以后\u2026\u2026"},{"images":["https://pic1.zhimg.com/v2-ec92ff9d78f5a4221b20122a7f6e6294.jpg"],"type":0,"id":9570587,"ga_prefix":"081511","title":"动画角色存在「演技」吗？"},{"images":["https://pic4.zhimg.com/v2-ddfb5b850344f7599c9825b41d9942e3.jpg"],"type":0,"id":9571641,"ga_prefix":"081510","title":"下楼买个瓜，分分钟就可以做出一道米其林餐厅的甜点"},{"images":["https://pic3.zhimg.com/v2-e6058dcac3178a3ca7e3f42e53b3c62e.jpg"],"type":0,"id":9565192,"ga_prefix":"081509","title":"为什么 HR 签 offer 的时候，老喜欢压人薪资？"},{"images":["https://pic4.zhimg.com/v2-3b0beb2e849141326f5925f2af123017.jpg"],"type":0,"id":9571373,"ga_prefix":"081508","title":"在绳子上跳舞，一个打发时间的游戏就这样变成了极限运动"},{"images":["https://pic4.zhimg.com/v2-be695ac4d3c2ef058f7d568ec54f70e3.jpg"],"type":0,"id":9570124,"ga_prefix":"081507","title":"结婚当天如果下雨婚戒就免费，还有这种好事？"},{"images":["https://pic2.zhimg.com/v2-2a2517e3e3162d33db94b1ed0d72cf85.jpg"],"type":0,"id":9571318,"ga_prefix":"081507","title":"当司法遇上媒体，判决会走向何方？"},{"images":["https://pic1.zhimg.com/v2-e88b0951995a35848bec83a195cbb4a0.jpg"],"type":0,"id":9571004,"ga_prefix":"081507","title":"你曾经熟悉的暴风影音，正在模仿乐视的路上迷失自我"},{"images":["https://pic1.zhimg.com/v2-1d10ec78962b866ddb40df509ddb167c.jpg"],"type":0,"id":9570739,"ga_prefix":"081506","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic4.zhimg.com/v2-ba0012eebfae7d51e9a199191918629b.jpg","type":0,"id":9572302,"ga_prefix":"081519","title":"哆啦 A 梦开心地说：「日本战败了」"},{"image":"https://pic2.zhimg.com/v2-4bd5eeb0154a34baca9c91f5b47ef8a1.jpg","type":0,"id":9571760,"ga_prefix":"081516","title":"被老师扇了耳光，学生当场猛扇回去该不该？"},{"image":"https://pic2.zhimg.com/v2-727e1a1027cd0a4e2901fa43ee4a2759.jpg","type":0,"id":9572187,"ga_prefix":"081515","title":"香港的经济出了哪些问题？"},{"image":"https://pic4.zhimg.com/v2-d9eeb538528a38e4f02577c98b7f0ba3.jpg","type":0,"id":9570587,"ga_prefix":"081511","title":"动画角色存在「演技」吗？"},{"image":"https://pic2.zhimg.com/v2-0b5ae3e0b303fbc961219754d4c22565.jpg","type":0,"id":9571641,"ga_prefix":"081510","title":"下楼买个瓜，分分钟就可以做出一道米其林餐厅的甜点"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * title : 哆啦 A 梦开心地说：「日本战败了」
         * ga_prefix : 081519
         * images : ["https://pic4.zhimg.com/v2-13119c828931783b17da482e7a6488c3.jpg"]
         * multipic : true
         * type : 0
         * id : 9572302
         */

        private String title;
        private String ga_prefix;
        private boolean multipic;
        private int type;
        private int id;
        private List<String> images;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic4.zhimg.com/v2-ba0012eebfae7d51e9a199191918629b.jpg
         * type : 0
         * id : 9572302
         * ga_prefix : 081519
         * title : 哆啦 A 梦开心地说：「日本战败了」
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
