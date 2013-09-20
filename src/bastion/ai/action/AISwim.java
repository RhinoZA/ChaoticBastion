package bastion.ai.action;

import bastion.entity.friendly.GolemBase;

public class AISwim extends ActionBase
{
    public AISwim(GolemBase golem)
    {
        super(golem);
        this.setMutexBits(4);
        golem.getNavigator().setCanSwim(true);
    }

    public boolean shouldExecute ()
    {
        if (golem.isInWater() || this.golem.handleLavaMovement())
        {
            return true;
        }
        return false;
    }

    /*public void startExecuting()
    {
        if(golem.standby())
        {
            golem.setPatrolMode();
        }
    }*/

    public void updateTask ()
    {
        if (this.golem.getRNG().nextFloat() < 0.8F)
        {
            this.golem.getJumpHelper().setJumping();
        }
    }
}
