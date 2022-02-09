# 阳光沙滩App Kotlin 版

* 项目地址：[Github](https://github.com/anjiemo/SunnyBeach-Kotlin)

* Java & Kotlin 版本：[SunnyBeach](https://github.com/anjiemo/SunnyBeach)

* 博客地址：[写BUG，因为更专注，所以更专业！](https://www.sunofbeach.net/u/1204736502274318336)

* 另外你如果对 Kotlin 不熟悉，恰好想学习的话，推荐你通过下面这三篇文章来学习

    * [全民 Kotlin：Java我们不一样](https://www.jianshu.com/p/a01e6b957269)

    * [全民 Kotlin：你没有玩过的全新玩法](https://www.jianshu.com/p/884ca0a49e5e)

    * [全民 Kotlin：协程特别篇](https://www.jianshu.com/p/2e0746c7d4f3)

* 如果你想学习更加标准、官方的 Kotlin 代码，我比较推荐学习官方文档
    * [Kotlin 语言中文站](https://www.kotlincn.net/docs/reference/)
    * [Kotlin 语言英文站](https://kotlinlang.org/docs/basic-syntax.html)

#### 常用界面

![](picture/activity/1.jpg) ![](picture/activity/2.jpg) ![](picture/activity/3.jpg)

![](picture/activity/4.jpg) ![](picture/activity/5.jpg) ![](picture/activity/6.jpg)

![](picture/activity/7.jpg) ![](picture/activity/8.jpg) ![](picture/activity/9.jpg)

![](picture/activity/10.jpg) ![](picture/activity/11.jpg) ![](picture/activity/12.jpg)

![](picture/activity/13.jpg) ![](picture/activity/14.jpg) ![](picture/activity/15.jpg)

![](picture/activity/16.jpg) ![](picture/activity/17.jpg) ![](picture/activity/18.jpg)

![](picture/activity/19.jpg) ![](picture/activity/20.jpg) ![](picture/activity/21.jpg)

![](picture/activity/22.jpg) ![](picture/activity/23.jpg) ![](picture/activity/24.jpg)

![](picture/activity/25.jpg) ![](picture/activity/26.jpg) ![](picture/activity/27.jpg)

------

![](picture/activity/28.jpg)

![](picture/activity/29.jpg)

![](picture/activity/30.jpg)

![](picture/activity/31.jpg)

![](picture/activity/32.jpg)

![](picture/activity/33.jpg)

![](picture/activity/34.jpg)

![](picture/activity/35.jpg)

![](picture/activity/36.jpg)

#### 常用对话框

![](picture/dialog/1.jpg) ![](picture/dialog/2.jpg) ![](picture/dialog/3.jpg)

![](picture/dialog/4.jpg) ![](picture/dialog/5.jpg) ![](picture/dialog/6.jpg)

![](picture/dialog/7.jpg) ![](picture/dialog/8.jpg) ![](picture/dialog/9.jpg)

![](picture/dialog/10.jpg) ![](picture/dialog/11.jpg) ![](picture/dialog/12.jpg)

![](picture/dialog/13.jpg) ![](picture/dialog/14.jpg) ![](picture/dialog/15.jpg)

![](picture/dialog/16.jpg) ![](picture/dialog/17.jpg) ![](picture/dialog/18.jpg)

#### 动图欣赏

![](picture/gif/1.gif) ![](picture/gif/2.gif) ![](picture/gif/3.gif)

![](picture/gif/4.gif) ![](picture/gif/5.gif) ![](picture/gif/6.gif)

![](picture/gif/7.gif) ![](picture/gif/8.gif) ![](picture/gif/9.gif)

![](picture/gif/10.gif) ![](picture/gif/11.gif) ![](picture/gif/12.gif)

#### 项目亮点

* App 优化：已经进行了全面的内存优化、布局优化、代码优化、瘦身优化，并且对结果进行了严格的长久测试。

* 代码规范：参照 Android SDK 、Support 源码和参考阿里巴巴的代码规范文档对代码进行命名，并对难点代码进行了注释，对重点代码进行了说明。

* 代码统一：对项目中常见的代码进行了封装，或是封装到基类中、或是封装到工具类中、或者封装到框架中，不追求过度封装，根据实际场景和代码维护性考虑，尽量保证同一个功能的代码在项目中不重复。

* 敏捷开发：一个 App 大概率会出现的功能已经写好，对项目的敏捷开发起到了至关重要的作用，可用于新项目开发或者旧项目重构，可将开发周期缩短近一半的时间，并且后续不会因为前期的快速开发而留下成堆的技术遗留问题，万丈高楼平地起，AndroidProject 属于基建工程，而在软件行业我们称之为技术中台。

* 无任何瑕疵：对小屏手机、全面屏手机、带虚拟按键手机进行了适配和优化，确保每一个界面细节都能处理到位、每一个功能细节都能符合大众的需求、乃至每一行代码都能贴合 Android 程序员的审美观。

* 兼容性优良：在此感谢开源道路上给予我支持和帮助的小伙伴，一个人一台机在兼容性面前无能为力，而在几百人几百台机面前却不是问题。如果没有这些的测试，有些问题我一个人可能这辈子都发现不了，纵使代码写得再好，逻辑再严谨，没有经过大众的验证，无异于纸上谈兵。

* 优秀的代码设计：AndroidProject 对 startActivityForResult 的设计进行了改良，使得可以直接在方法上传入监听对象，这样我们就不需要重写 onActivityResult 方法来拿到回调，另外原生的 startActivityForResult 还需要传 requestCode 参数，而 AndroidProject 会自动帮你生成这个 requestCode 码，并在 onActivityResult 进行判断，如果满足条件，那么就会回调外层传入的监听对象。然而这只是冰山一角，更多优秀的代码设计还需要你通过阅读 AndroidProject 源码的形式来发掘，在这里不再细说。

#### [代码规范文档请点击这里查看](https://github.com/getActivity/AndroidCodeStandard)

#### [版本适配文档请点击这里查看](https://github.com/getActivity/AndroidVersionAdapter)

#### 如果您觉得我的这个项目对你有帮助，请扫描下方的二维码随意打赏，要是能打赏个 10.24 :monkey_face:就太:thumbsup:了。您的支持将鼓励我继续创作:octocat:

![](https://camo.githubusercontent.com/aec2ee4e291ef1b6d7ce5b663f9d78cc8a40ccc24eb38c58e1135ce102dfd58f/68747470733a2f2f67697465652e636f6d2f616e6a69656d6f2f6669677572652d6265642f7261772f6d61737465722f696d672f32303231303632343132353832312e706e67)

## License

```text
Copyright 2021 He XiaoFeng

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```