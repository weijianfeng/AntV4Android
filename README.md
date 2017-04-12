# AntV4Android

通过 JS Bridge 借助[AntV](https://antv.alipay.com/)的G2图表库，实现Android本地的图表绘制。

柱状图和折线图封装了简单的api，可以动态设置数据。如下：
![](http://odbsc6ngk.bkt.clouddn.com/a.gif)

G2库中提供了很多炫酷的图表，也可以直接用。（代码中未封装api）如下：
![](http://odbsc6ngk.bkt.clouddn.com/image/antv2.gif)

其实Android的三方图表库异常丰富，似乎没必要这么折腾，说两句缘由和优缺点吧。

## 缘由
* 之前做了些H5相关的事，接触了AntV，正好也好久没碰js bridge了。找个场景结合下。
* 老板和产品经理经常说的一句话：Android 和 iOS 表现为什么做不到一样呢。。。

## 优点
* 如果非要追求多端一致，改一份前端代码就好。
* 利用轮子，异常丰富的动画和样式，如果在Pad设备上做数据报表类，可能能用到。

## 缺点
* 基于webview展示，内存问题要考虑。
* 由于需要加在各种js脚本，绘制图表的过程，不如native快。