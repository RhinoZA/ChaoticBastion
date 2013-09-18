package bastion.skill;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Jump extends Skill
{
    private static final ResourceLocation three = new ResourceLocation("chaoticbastion", "textures/skill/Jump48x.png");
    @Override
    public ResourceLocation getTextureFile (int guiscale)
    {
        return three;
    }

    @Override
    public String getSkillName ()
    {
        return "Jump";
    }

    @Override
    public void activate (Entity entity, World world)
    {
        if (entity.onGround)
            entity.motionY = 0.8f;
    }

}
