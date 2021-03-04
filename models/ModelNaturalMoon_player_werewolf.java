// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelNaturalMoon_player_werewolf extends EntityModel {
	private final ModelRenderer Werewolf;
	private final ModelRenderer Body;
	private final ModelRenderer lowerbody_r1;
	private final ModelRenderer upperbody_r1;
	private final ModelRenderer upperbody_r2;
	private final ModelRenderer neck_r1;
	private final ModelRenderer Tail1;
	private final ModelRenderer tail1_r1;
	private final ModelRenderer Tail2;
	private final ModelRenderer tail2_r1;
	private final ModelRenderer Head;
	private final ModelRenderer brow2_r1;
	private final ModelRenderer brow1_r1;
	private final ModelRenderer Ear1;
	private final ModelRenderer ear1_r1;
	private final ModelRenderer Ear2;
	private final ModelRenderer ear2_r1;
	private final ModelRenderer Jaw;
	private final ModelRenderer LArm;
	private final ModelRenderer claw_r1;
	private final ModelRenderer claw_r2;
	private final ModelRenderer claw_r3;
	private final ModelRenderer claw_r4;
	private final ModelRenderer claw_r5;
	private final ModelRenderer lefthand_r1;
	private final ModelRenderer leftarm_r1;
	private final ModelRenderer leftshoulder_r1;
	private final ModelRenderer RArm;
	private final ModelRenderer claw_r6;
	private final ModelRenderer claw_r7;
	private final ModelRenderer claw_r8;
	private final ModelRenderer claw_r9;
	private final ModelRenderer claw_r10;
	private final ModelRenderer righthand_r1;
	private final ModelRenderer rightarm_r1;
	private final ModelRenderer rightshoulder_r1;
	private final ModelRenderer LLeg;
	private final ModelRenderer claw_r11;
	private final ModelRenderer leftankle_r1;
	private final ModelRenderer leftknee_r1;
	private final ModelRenderer leftcalve_r1;
	private final ModelRenderer RLeg;
	private final ModelRenderer claw_r12;
	private final ModelRenderer rightankle_r1;
	private final ModelRenderer rightknee_r1;
	private final ModelRenderer rightcalve_r1;

	public ModelNaturalMoon_player_werewolf() {
		textureWidth = 128;
		textureHeight = 128;

		Werewolf = new ModelRenderer(this);
		Werewolf.setRotationPoint(0.0F, 24.0F, 5.0F);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-4.0F, -36.5F, -2.0F);
		Werewolf.addChild(Body);

		lowerbody_r1 = new ModelRenderer(this);
		lowerbody_r1.setRotationPoint(4.0F, 22.5F, 5.0F);
		Body.addChild(lowerbody_r1);
		setRotationAngle(lowerbody_r1, 0.3927F, 0.0F, 0.0F);
		lowerbody_r1.cubeList.add(new ModelBox(lowerbody_r1, 34, 0, -4.0F, -8.2492F, 0.8289F, 8, 9, 5, 0.0F, false));

		upperbody_r1 = new ModelRenderer(this);
		upperbody_r1.setRotationPoint(4.0F, 17.0F, 2.0F);
		Body.addChild(upperbody_r1);
		setRotationAngle(upperbody_r1, 0.3927F, 0.0F, 0.0F);
		upperbody_r1.cubeList.add(new ModelBox(upperbody_r1, 51, 28, -4.0F, -11.4839F, -0.3233F, 8, 4, 3, 0.0F, false));

		upperbody_r2 = new ModelRenderer(this);
		upperbody_r2.setRotationPoint(4.0F, 17.5F, 2.0F);
		Body.addChild(upperbody_r2);
		setRotationAngle(upperbody_r2, 0.3927F, 0.0F, 0.0F);
		upperbody_r2.cubeList.add(new ModelBox(upperbody_r2, 0, 0, -5.0F, -11.4839F, 0.6767F, 10, 13, 7, 0.0F, false));

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(0.0F, 0.5F, 1.0F);
		Body.addChild(neck_r1);
		setRotationAngle(neck_r1, 0.4363F, 0.0F, 0.0F);
		neck_r1.cubeList.add(new ModelBox(neck_r1, 0, 20, -0.25F, 1.1114F, -3.6084F, 8, 11, 6, 0.0F, false));

		Tail1 = new ModelRenderer(this);
		Tail1.setRotationPoint(4.0F, 22.0F, 6.0F);
		Body.addChild(Tail1);

		tail1_r1 = new ModelRenderer(this);
		tail1_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
		Tail1.addChild(tail1_r1);
		setRotationAngle(tail1_r1, -0.7854F, 0.0F, 0.0F);
		tail1_r1.cubeList.add(new ModelBox(tail1_r1, 26, 14, -2.0F, -4.8284F, -0.3432F, 4, 4, 8, 0.0F, false));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 3.5F, 4.0F);
		Tail1.addChild(Tail2);

		tail2_r1 = new ModelRenderer(this);
		tail2_r1.setRotationPoint(0.0F, 2.2768F, 5.3086F);
		Tail2.addChild(tail2_r1);
		setRotationAngle(tail2_r1, -0.3927F, 0.0F, 0.0F);
		tail2_r1.cubeList.add(new ModelBox(tail2_r1, 16, 42, -1.5F, -3.5719F, -3.611F, 3, 3, 8, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(4.0F, 6.25F, 1.8708F);
		Body.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 28, 28, -4.0F, -6.25F, -5.8708F, 8, 7, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 37, -2.0F, -2.75F, -9.8708F, 4, 2, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 16, 42, -2.1F, -1.25F, -9.7708F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 36, 26, 0.9F, -1.5F, -8.6208F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 24, -1.9F, -1.5F, -8.6208F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 40, 26, 1.1F, -1.25F, -9.7708F, 1, 1, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 56, -2.0F, 0.25F, -6.1208F, 4, 1, 3, 0.0F, false));

		brow2_r1 = new ModelRenderer(this);
		brow2_r1.setRotationPoint(2.3534F, -3.4847F, -8.3708F);
		Head.addChild(brow2_r1);
		setRotationAngle(brow2_r1, 0.0F, 0.0F, -0.1309F);
		brow2_r1.cubeList.add(new ModelBox(brow2_r1, 22, 20, -1.5165F, -1.5766F, 2.0F, 3, 1, 1, 0.0F, false));

		brow1_r1 = new ModelRenderer(this);
		brow1_r1.setRotationPoint(-2.25F, -3.25F, -9.3708F);
		Head.addChild(brow1_r1);
		setRotationAngle(brow1_r1, 0.0F, 0.0F, 0.1309F);
		brow1_r1.cubeList.add(new ModelBox(brow1_r1, 28, 26, -1.5788F, -1.8007F, 3.0F, 3, 1, 1, 0.0F, false));

		Ear1 = new ModelRenderer(this);
		Ear1.setRotationPoint(-3.0F, -5.25F, -5.8708F);
		Head.addChild(Ear1);

		ear1_r1 = new ModelRenderer(this);
		ear1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ear1.addChild(ear1_r1);
		setRotationAngle(ear1_r1, -0.3927F, 0.0F, 0.0F);
		ear1_r1.cubeList.add(new ModelBox(ear1_r1, 0, 20, -1.0F, -4.3722F, 1.926F, 2, 3, 1, 0.0F, false));

		Ear2 = new ModelRenderer(this);
		Ear2.setRotationPoint(3.0F, -5.25F, -5.8708F);
		Head.addChild(Ear2);

		ear2_r1 = new ModelRenderer(this);
		ear2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ear2.addChild(ear2_r1);
		setRotationAngle(ear2_r1, -0.3927F, 0.0F, 0.0F);
		ear2_r1.cubeList.add(new ModelBox(ear2_r1, 0, 0, -1.0F, -4.3722F, 1.926F, 2, 3, 1, 0.0F, false));

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, 1.75F, -7.8708F);
		Head.addChild(Jaw);
		Jaw.cubeList.add(new ModelBox(Jaw, 62, 9, -2.0F, -1.5F, -2.25F, 4, 1, 5, 0.0F, false));
		Jaw.cubeList.add(new ModelBox(Jaw, 31, 33, -1.9F, -2.0F, -0.75F, 1, 1, 1, 0.0F, false));
		Jaw.cubeList.add(new ModelBox(Jaw, 31, 30, -1.75F, -1.75F, -2.15F, 1, 1, 1, 0.0F, false));
		Jaw.cubeList.add(new ModelBox(Jaw, 30, 20, 0.75F, -1.75F, -2.15F, 1, 1, 1, 0.0F, false));
		Jaw.cubeList.add(new ModelBox(Jaw, 27, 5, 0.9F, -2.0F, -0.75F, 1, 1, 1, 0.0F, false));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(9.0F, 7.0F, 3.0F);
		Body.addChild(LArm);

		claw_r1 = new ModelRenderer(this);
		claw_r1.setRotationPoint(4.55F, 15.1642F, -8.4142F);
		LArm.addChild(claw_r1);
		setRotationAngle(claw_r1, -1.7802F, 0.0873F, 0.0F);
		claw_r1.cubeList.add(new ModelBox(claw_r1, 0, 37, 0.7384F, 0.2085F, -3.9821F, 1, 1, 3, 0.0F, false));

		claw_r2 = new ModelRenderer(this);
		claw_r2.setRotationPoint(4.45F, 14.9142F, -8.6642F);
		LArm.addChild(claw_r2);
		setRotationAngle(claw_r2, -1.7802F, 0.0436F, 0.0F);
		claw_r2.cubeList.add(new ModelBox(claw_r2, 16, 37, -0.1308F, 0.2001F, -3.9839F, 1, 1, 4, 0.0F, false));

		claw_r3 = new ModelRenderer(this);
		claw_r3.setRotationPoint(4.45F, 15.1642F, -8.6642F);
		LArm.addChild(claw_r3);
		setRotationAngle(claw_r3, -1.7802F, 0.0873F, 0.0F);
		claw_r3.cubeList.add(new ModelBox(claw_r3, 27, 0, -1.2616F, 0.2085F, -3.9821F, 1, 1, 4, 0.0F, false));

		claw_r4 = new ModelRenderer(this);
		claw_r4.setRotationPoint(4.35F, 15.1642F, -8.4142F);
		LArm.addChild(claw_r4);
		setRotationAngle(claw_r4, -1.7802F, 0.0873F, 0.0F);
		claw_r4.cubeList.add(new ModelBox(claw_r4, 0, 41, -2.2616F, 0.2085F, -3.9821F, 1, 1, 3, 0.0F, false));

		claw_r5 = new ModelRenderer(this);
		claw_r5.setRotationPoint(2.477F, 15.4481F, -10.7189F);
		LArm.addChild(claw_r5);
		setRotationAngle(claw_r5, -0.5236F, 0.0873F, 0.2618F);
		claw_r5.cubeList.add(new ModelBox(claw_r5, 0, 4, -1.0194F, -3.3195F, 1.5857F, 1, 2, 1, 0.0F, false));

		lefthand_r1 = new ModelRenderer(this);
		lefthand_r1.setRotationPoint(4.45F, 12.9142F, -8.4142F);
		LArm.addChild(lefthand_r1);
		setRotationAngle(lefthand_r1, -1.1781F, 0.0873F, 0.0F);
		lefthand_r1.cubeList.add(new ModelBox(lefthand_r1, 48, 66, -2.2616F, -4.2199F, -2.1629F, 4, 4, 4, 0.0F, false));

		leftarm_r1 = new ModelRenderer(this);
		leftarm_r1.setRotationPoint(4.25F, 6.5F, -3.0F);
		LArm.addChild(leftarm_r1);
		setRotationAngle(leftarm_r1, -0.7854F, 0.0F, 0.0F);
		leftarm_r1.cubeList.add(new ModelBox(leftarm_r1, 38, 42, -2.0F, -3.8787F, 0.1213F, 4, 10, 4, 0.0F, false));

		leftshoulder_r1 = new ModelRenderer(this);
		leftshoulder_r1.setRotationPoint(0.6569F, -0.5F, -3.0F);
		LArm.addChild(leftshoulder_r1);
		setRotationAngle(leftshoulder_r1, 0.0F, 0.0F, -0.3927F);
		leftshoulder_r1.cubeList
				.add(new ModelBox(leftshoulder_r1, 50, 14, -1.683F, -1.5391F, 1.0F, 4, 10, 4, 0.0F, false));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-1.0F, 7.0F, 3.0F);
		Body.addChild(RArm);

		claw_r6 = new ModelRenderer(this);
		claw_r6.setRotationPoint(-4.8F, 15.1642F, -8.4142F);
		RArm.addChild(claw_r6);
		setRotationAngle(claw_r6, -1.789F, -0.0873F, 0.0F);
		claw_r6.cubeList.add(new ModelBox(claw_r6, 42, 14, -1.7384F, 0.2227F, -4.0059F, 1, 1, 3, 0.0F, false));

		claw_r7 = new ModelRenderer(this);
		claw_r7.setRotationPoint(-4.7F, 14.9142F, -8.6642F);
		RArm.addChild(claw_r7);
		setRotationAngle(claw_r7, -1.789F, -0.0436F, 0.0F);
		claw_r7.cubeList.add(new ModelBox(claw_r7, 66, 23, -0.8692F, 0.2143F, -4.0078F, 1, 1, 4, 0.0F, false));

		claw_r8 = new ModelRenderer(this);
		claw_r8.setRotationPoint(-4.7F, 15.1642F, -8.4142F);
		RArm.addChild(claw_r8);
		setRotationAngle(claw_r8, -1.789F, -0.0873F, 0.0F);
		claw_r8.cubeList.add(new ModelBox(claw_r8, 55, 0, 0.2616F, 0.2227F, -4.0059F, 1, 1, 4, 0.0F, false));

		claw_r9 = new ModelRenderer(this);
		claw_r9.setRotationPoint(-4.6F, 15.4142F, -8.4142F);
		RArm.addChild(claw_r9);
		setRotationAngle(claw_r9, -1.789F, -0.0873F, 0.0F);
		claw_r9.cubeList.add(new ModelBox(claw_r9, 30, 42, 1.2616F, 0.2227F, -4.0059F, 1, 1, 3, 0.0F, false));

		claw_r10 = new ModelRenderer(this);
		claw_r10.setRotationPoint(-2.727F, 15.4481F, -10.4689F);
		RArm.addChild(claw_r10);
		setRotationAngle(claw_r10, -0.5236F, -0.0873F, -0.2618F);
		claw_r10.cubeList.add(new ModelBox(claw_r10, 22, 22, 0.0194F, -3.3195F, 1.5857F, 1, 2, 1, 0.0F, false));

		righthand_r1 = new ModelRenderer(this);
		righthand_r1.setRotationPoint(-4.7F, 12.9142F, -8.4142F);
		RArm.addChild(righthand_r1);
		setRotationAngle(righthand_r1, -1.1781F, -0.0873F, 0.0F);
		righthand_r1.cubeList
				.add(new ModelBox(righthand_r1, 66, 15, -1.7384F, -4.2199F, -2.1629F, 4, 4, 4, 0.0F, false));

		rightarm_r1 = new ModelRenderer(this);
		rightarm_r1.setRotationPoint(-4.5F, 7.5F, -3.0F);
		RArm.addChild(rightarm_r1);
		setRotationAngle(rightarm_r1, -0.7854F, 0.0F, 0.0F);
		rightarm_r1.cubeList.add(new ModelBox(rightarm_r1, 0, 47, -2.0F, -4.5858F, -0.5858F, 4, 10, 4, 0.0F, false));

		rightshoulder_r1 = new ModelRenderer(this);
		rightshoulder_r1.setRotationPoint(-1.0F, -0.5F, -3.0F);
		RArm.addChild(rightshoulder_r1);
		setRotationAngle(rightshoulder_r1, 0.0F, 0.0F, 0.3927F);
		rightshoulder_r1.cubeList
				.add(new ModelBox(rightshoulder_r1, 50, 52, -2.317F, -1.5391F, 1.0F, 4, 10, 4, 0.0F, false));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(4.0F, -15.4F, 4.4F);
		Werewolf.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 32, 60, -2.0F, 12.4F, -5.4F, 4, 2, 6, 0.0F, false));

		claw_r11 = new ModelRenderer(this);
		claw_r11.setRotationPoint(-0.1F, 15.4F, -9.4F);
		LLeg.addChild(claw_r11);
		setRotationAngle(claw_r11, -0.3927F, 0.0F, 0.0F);
		claw_r11.cubeList.add(new ModelBox(claw_r11, 27, 0, -2.0F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
		claw_r11.cubeList.add(new ModelBox(claw_r11, 28, 28, 1.2F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
		claw_r11.cubeList.add(new ModelBox(claw_r11, 28, 31, -0.4F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));

		leftankle_r1 = new ModelRenderer(this);
		leftankle_r1.setRotationPoint(0.0F, 14.9F, -3.4F);
		LLeg.addChild(leftankle_r1);
		setRotationAngle(leftankle_r1, -0.3927F, 0.0F, 0.0F);
		leftankle_r1.cubeList.add(new ModelBox(leftankle_r1, 13, 67, -2.0F, -8.0719F, 0.389F, 4, 6, 3, 0.0F, false));

		leftknee_r1 = new ModelRenderer(this);
		leftknee_r1.setRotationPoint(0.0F, 4.15F, -4.9F);
		LLeg.addChild(leftknee_r1);
		setRotationAngle(leftknee_r1, -0.3927F, 0.0F, 0.0F);
		leftknee_r1.cubeList.add(new ModelBox(leftknee_r1, 60, 0, -1.0F, -0.0719F, 2.389F, 2, 3, 6, 0.0F, false));

		leftcalve_r1 = new ModelRenderer(this);
		leftcalve_r1.setRotationPoint(0.0F, 5.4F, -4.4F);
		LLeg.addChild(leftcalve_r1);
		setRotationAngle(leftcalve_r1, -0.3927F, 0.0F, 0.0F);
		leftcalve_r1.cubeList.add(new ModelBox(leftcalve_r1, 54, 38, -2.0F, -8.0719F, 0.389F, 4, 10, 4, 0.0F, false));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-4.25F, -15.4F, 4.5F);
		Werewolf.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 60, 60, -1.75F, 12.4F, -5.5F, 4, 2, 6, 0.0F, false));

		claw_r12 = new ModelRenderer(this);
		claw_r12.setRotationPoint(1.75F, 15.4F, -9.5F);
		RLeg.addChild(claw_r12);
		setRotationAngle(claw_r12, -0.3927F, 0.0F, 0.0F);
		claw_r12.cubeList.add(new ModelBox(claw_r12, 33, 0, -2.0F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
		claw_r12.cubeList.add(new ModelBox(claw_r12, 16, 37, -0.4F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));
		claw_r12.cubeList.add(new ModelBox(claw_r12, 22, 37, -3.6F, -4.0719F, 2.389F, 1, 2, 1, 0.0F, false));

		rightankle_r1 = new ModelRenderer(this);
		rightankle_r1.setRotationPoint(0.25F, 14.9F, -3.5F);
		RLeg.addChild(rightankle_r1);
		setRotationAngle(rightankle_r1, -0.3927F, 0.0F, 0.0F);
		rightankle_r1.cubeList.add(new ModelBox(rightankle_r1, 67, 49, -2.0F, -8.0719F, 0.389F, 4, 6, 3, 0.0F, false));

		rightknee_r1 = new ModelRenderer(this);
		rightknee_r1.setRotationPoint(0.25F, 4.15F, -5.0F);
		RLeg.addChild(rightknee_r1);
		setRotationAngle(rightknee_r1, -0.3927F, 0.0F, 0.0F);
		rightknee_r1.cubeList.add(new ModelBox(rightknee_r1, 0, 61, -1.0F, -0.0719F, 2.389F, 2, 3, 6, 0.0F, false));

		rightcalve_r1 = new ModelRenderer(this);
		rightcalve_r1.setRotationPoint(0.25F, 5.4F, -4.5F);
		RLeg.addChild(rightcalve_r1);
		setRotationAngle(rightcalve_r1, -0.3927F, 0.0F, 0.0F);
		rightcalve_r1.cubeList.add(new ModelBox(rightcalve_r1, 16, 53, -2.0F, -8.0719F, 0.389F, 4, 10, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Werewolf.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.LLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.RLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}