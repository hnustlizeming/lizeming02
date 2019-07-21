package pattern.proxy.staticProxy;

import pattern.proxy.ISkillAction;

/**
 * @program: learn
 * @description: 带明星
 * @author: Elliot
 * @create: 2019-07-21 13:57
 **/
public class Star implements ISkillAction {
    @Override
    public void sing() {
        System.out.println("带明星在唱歌....");
    }

    @Override
    public void dance() {
        System.out.println("带明星在跳舞....");
    }

    @Override
    public void rapping() {
        System.out.println("带明星在rap.....");
    }
}
