package com.example.finalwork.bean;

import com.example.finalwork.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desce; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desce = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "坚果", "瑞士巧克力", "德芙巧克力", "每日坚果", "火腿肠", "网红巧克力","红枣零食","魔芋爽"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "三只松鼠坚果大礼包1535g休闲零食干果礼盒送礼9袋装炒货开心果",
            "瑞士莲巧克力软心球 进口lindor巧克力球结婚喜糖果散装零食lindt",
            "德芙麦提莎麦丽素麦芽脆夹心原味巧克力球520g桶网红小零食品糖果",
            "【百草味-坚果大礼包1532g/9袋】每日坚果混合装休闲干果零食礼盒",
            "【齐善素食 佛家纯素火腿肠】即食零食热量脂卡豆制品素肉素香肠",
            "卜珂速溶松露型黑巧克力碗装网红零食糖果送女友（代可可脂）",
            "满减【好想你_美丽方218g】枣夹核桃新疆特产无核小包装红枣零食",
            "金磨坊魔芋爽魔芋素毛肚小零食整箱麻辣辣味零食小吃休闲食品礼包"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {138, 52, 79, 98, 20, 27,51,10};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.szss_s,R.drawable.rsqkl_s, R.drawable.dfqkl_s,
            R.drawable.mrjg_s, R.drawable.htc_s, R.drawable.whqkl_s,
            R.drawable.hzls_s, R.drawable.mys_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.szss, R.drawable.rsqkl, R.drawable.dfqkl,
            R.drawable.mrjg, R.drawable.htc, R.drawable.whqkl,
            R.drawable.hzls, R.drawable.mys
    };

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desce = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}
