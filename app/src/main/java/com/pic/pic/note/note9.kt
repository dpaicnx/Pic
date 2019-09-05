package note

/**
 * git使用
 */

//常识：git编辑框编辑不到的时候 可以点Q字母

//对git自我介绍
//git config --global user.name "zhangsan"
//git config --global user.email "zhangsan@qq.com"

//git config --list 查看用户信息

//git init 初始化

//touch .gitignore 创建忽略文件

//git status 查看文件的状态

//----------------------------
// git提交到本地分为两步 相当于购物 首先把物品都放到购物车里面，然后一起去结账

//------------1.这里只是相当与提交到购物车-----------------

//git add + 需要提交的文件名
//git add --all  把没有提交的物品都提交

//------------2.这里才是去结账-------------------------

//git commit -m "提交的日志 eg： 第一次提交"

//git log 查看完整的提交日志
//git log -n 查看最近n次的提交记录 n可以为1，2，3。。。

//git reset --hard HEAD^  回退上一个版本
//git reset --hard HEAD~n  回退n个版本
//git reset --hard id 回退到某一个版本 id 是提交的是id ==》commit 65c11989ca849c871cb78bbf2c8d17fab2778b97

//git reflog  查看所有的记录

//git branch 查看当前分支
//git branch + 名字 创建一个为xx的分支
//git checkout + 名字  切换分支
//git checkout -b + 名字 创建一个叫xx的分支，并且切换到这个分支上面
//git branch -d + 名字 删除xx分支
//git merge + 名字 合并xx分支

//--------------------------远程仓库----------------------------------------

//在用户主目录下，看看有没有.ssh目录，如果有，再看看这个目录下有没有id_rsa和id_rsa.pub这两个文件。如果没有,执行下面命令，创建SSH Key： （id_rsa是私钥，id_rsa.pub是公钥）
//ssh-keygen -t rsa -C "youremail@example.com"  建议使用真实的邮箱
//git remote add + "远程仓库的名" 添加一个远程仓库
//git remote 查看远程仓库
//git push -u + "远程仓库的名字" + "需要推送的分支"    往远程仓库推送代码
//第一次连接远程仓库必须加-u 链接成功以后 下次在推送可以不加 ==》 git push + "远程仓库的名字" + "需要推送的分支"

//git clone 克隆
//git branch -a 查看远程仓库分支
//git pull 拉取远程仓库的代码

//-----------------------------------------------------------------------------

//git 问题
//
//git commit --amend 可以取消上一次提交，并且将暂存区的文件重新提交。也可以不修改内容，仅对描述进行修改。但素 ！ ！ 输入该命令行 按回车进入到 vim编辑器之后 发现根本编辑不了 (。-＿-。)
//后来在网上找了很多方法都解决不了，最后发现了下面这种做法可以解决这个问题以及编辑完之后 的完美保存退出
//刚进去时发现怎么也输入都没反应，是因为此时vim编辑器处于不可编辑状态，输入字母 c 可以进入编辑状态，这个时候就可以修改注释信息啦 ~
//修改完之后按esc键退出编辑状态，再按大写ZZ就可以保存退出vim编辑器。vim操作符中说的 qw 可以保存并退出 根本没用 (ーー;)


//git checkout -- code.txt add之前的撤销
//
//git reset HEAD code.txt  add之后的撤销
//
//git diff HEAD -- code.txt  当前code的代码与代码库的不同
//
//git diff HEAD HEAD^ -- code.txt 对比这两个版本的不同
//
//git stash  保存当前工作状态
//
//git stash pop 恢复当前工作状态
