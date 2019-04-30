package addable;

public class Material
{
  public static final int AIR = 0;
  public static final int STONE = 1;
  public static final int COBBLESTONE = 4;
  public static final int WOODEN_PLANK = 5;
  public static final int BEDROCK = 7;
  public static final int WATER = 8;
  public static final int WATER_MOVING = 9;
  public static final int LAVA = 10;
  public static final int LAVA_MOVING = 11;
  public static final int LEAVES = 18;
  public static final int GLASS_BLOCK = 20;
  public static final int SANDSTONE = 24;
  public static final int STONE_SLAB = 44;
  public static final int TORCH = 50;
  public static final int WOODEN_STAIRS_EAST = 53;
  public static final int COBBLESTONE_STAIRS_EAST = 67;
  public static final int PUMPKIN_SOUTH = 86;
  public static final int JACK_SOUTH = 87;
  public static final int ICE = 79;
  public static final int BRICK_STAIRS_EAST = 108;
  public static final int STONE_BRICK_STAIRS_EAST = 109;
  public static final int NETHER_BRICK_STAIRS_EAST = 114;
  public static final int END_PORTAL_FRAME = 120;
  public static final int LAMP_OFF = 123;
  public static final int LAMP_ON = 124;
  public static final int OAK_WOOD_SLAB = 126;
  public static final int SANDSTONE_STAIRS_EAST = 128;
  public static final int EMERALD_ORE = 129;
  public static final int ENDER_CHEST = 130;
  public static final int EMERALD_BLOCK = 133;
  public static final int PINE_WOOD_STAIRS_EAST = 134;
  public static final int BIRCH_WOOD_STAIRS_EAST = 135;
  public static final int JUNGLE_WOOD_STAIRS_EAST = 136;
  public static final int SANDSTONE_SLAB = 296;
  public static final int WOODEN_PLANK_SLAB = 297;
  public static final int COBBLESTONE_SLAB = 298;
  public static final int BRICK_SLAB = 299;
  public static final int STONE_BRICK_SLAB = 300;
  public static final int ALTERNATIVE_STONE_SLAB = 301;
  public static final int NETHER_SLAB = 302;
  public static final int STONE_HIGH_SLAB = 303;
  public static final int SANDSTONE_HIGH_SLAB = 304;
  public static final int WOODEN_PLANK_HIGH_SLAB = 305;
  public static final int COBBLESTONE_HIGH_SLAB = 306;
  public static final int BRICK_HIGH_SLAB = 307;
  public static final int STONE_BRICK_HIGH_SLAB = 308;
  public static final int ALTERNATIVE_STONE_HIGH_SLAB = 309;
  public static final int NETHER_HIGH_SLAB = 310;
  public static final int WOODEN_STAIRS_WEST = 314;
  public static final int WOODEN_STAIRS_SOUTH = 315;
  public static final int WOODEN_STAIRS_NORTH = 316;
  public static final int COBBLESTONE_STAIRS_WEST = 317;
  public static final int COBBLESTONE_STAIRS_SOUTH = 318;
  public static final int COBBLESTONE_STAIRS_NORTH = 319;
  public static final int BRICK_STAIRS_WEST = 320;
  public static final int BRICK_STAIRS_SOUTH = 321;
  public static final int BRICK_STAIRS_NORTH = 322;
  public static final int STONE_BRICK_STAIRS_WEST = 323;
  public static final int STONE_BRICK_STAIRS_SOUTH = 324;
  public static final int STONE_BRICK_STAIRS_NORTH = 325;
  public static final int NETHER_BRICK_STAIRS_WEST = 326;
  public static final int NETHER_BRICK_STAIRS_SOUTH = 327;
  public static final int NETHER_BRICK_STAIRS_NORTH = 328;
  public static final int PLAYER_CLIP = 345;
  public static final int JUNGLE_WOOD = 365;
  public static final int JUNGLE_LEAVES = 366;
  public static final int CIRCLE_STONE = 367;
  public static final int WOODEN_STAIRS_HIGH_EAST = 368;
  public static final int WOODEN_STAIRS_HIGH_WEST = 369;
  public static final int WOODEN_STAIRS_HIGH_SOUTH = 370;
  public static final int WOODEN_STAIRS_HIGH_NORTH = 371;
  public static final int COBBLESTONE_STAIRS_HIGH_EAST = 372;
  public static final int COBBLESTONE_STAIRS_HIGH_WEST = 373;
  public static final int COBBLESTONE_STAIRS_HIGH_SOUTH = 374;
  public static final int COBBLESTONE_STAIRS_HIGH_NORTH = 375;
  public static final int BRICK_STAIRS_HIGH_EAST = 376;
  public static final int BRICK_STAIRS_HIGH_WEST = 377;
  public static final int BRICK_STAIRS_HIGH_SOUTH = 378;
  public static final int BRICK_STAIRS_HIGH_NORTH = 379;
  public static final int STONE_BRICK_STAIRS_HIGH_EAST = 380;
  public static final int STONE_BRICK_STAIRS_HIGH_WEST = 381;
  public static final int STONE_BRICK_STAIRS_HIGH_SOUTH = 382;
  public static final int STONE_BRICK_STAIRS_HIGH_NORTH = 383;
  public static final int NETHER_BRICK_STAIRS_HIGH_EAST = 384;
  public static final int NETHER_BRICK_STAIRS_HIGH_WEST = 385;
  public static final int NETHER_BRICK_STAIRS_HIGH_SOUTH = 386;
  public static final int NETHER_BRICK_STAIRS_HIGH_NORTH = 387;
  public static final int PLAYER_CLIP_RAMP_EAST = 389;
  public static final int PLAYER_CLIP_RAMP_WEST = 390;
  public static final int PLAYER_CLIP_RAMP_SOUTH = 391;
  public static final int PLAYER_CLIP_RAMP_NORTH = 392;
  public static final int PINE_WOOD_STAIRS_WEST = 393;
  public static final int PINE_WOOD_STAIRS_SOUTH = 394;
  public static final int PINE_WOOD_STAIRS_NORTH = 395;
  public static final int PINE_WOOD_STAIRS_HIGH_EAST = 396;
  public static final int PINE_WOOD_STAIRS_HIGH_WEST = 397;
  public static final int PINE_WOOD_STAIRS_HIGH_SOUTH = 398;
  public static final int PINE_WOOD_STAIRS_HIGH_NORTH = 399;
  public static final int PINE_WOOD_SLAB = 400;
  public static final int BIRCH_WOOD_SLAB = 401;
  public static final int JUNGLE_WOOD_SLAB = 402;
  public static final int UNKNOWN_4_WOOD_SLAB = 403;
  public static final int UNKNOWN_5_WOOD_SLAB = 404;
  public static final int UNKNOWN_6_WOOD_SLAB = 405;
  public static final int UNKNOWN_7_WOOD_SLAB = 406;
  public static final int OAK_WOOD_HIGH_SLAB = 407;
  public static final int PINE_WOOD_HIGH_SLAB = 408;
  public static final int BIRCH_WOOD_HIGH_SLAB = 409;
  public static final int JUNGLE_WOOD_HIGH_SLAB = 410;
  public static final int UNKNOWN_4_WOOD_HIGH_SLAB = 411;
  public static final int UNKNOWN_5_WOOD_HIGH_SLAB = 412;
  public static final int UNKNOWN_6_WOOD_HIGH_SLAB = 413;
  public static final int UNKNOWN_7_WOOD_HIGH_SLAB = 414;
  public static final int BIRCH_WOOD_STAIRS_WEST = 415;
  public static final int BIRCH_WOOD_STAIRS_SOUTH = 416;
  public static final int BIRCH_WOOD_STAIRS_NORTH = 417;
  public static final int BIRCH_WOOD_STAIRS_HIGH_EAST = 418;
  public static final int BIRCH_WOOD_STAIRS_HIGH_WEST = 419;
  public static final int BIRCH_WOOD_STAIRS_HIGH_SOUTH = 420;
  public static final int BIRCH_WOOD_STAIRS_HIGH_NORTH = 421;
  public static final int JUNGLE_WOOD_STAIRS_WEST = 422;
  public static final int JUNGLE_WOOD_STAIRS_SOUTH = 423;
  public static final int JUNGLE_WOOD_STAIRS_NORTH = 424;
  public static final int JUNGLE_WOOD_STAIRS_HIGH_EAST = 425;
  public static final int JUNGLE_WOOD_STAIRS_HIGH_WEST = 426;
  public static final int JUNGLE_WOOD_STAIRS_HIGH_SOUTH = 427;
  public static final int JUNGLE_WOOD_STAIRS_HIGH_NORTH = 428;
  public static final int SANDSTONE_STAIRS_WEST = 429;
  public static final int SANDSTONE_STAIRS_SOUTH = 430;
  public static final int SANDSTONE_STAIRS_NORTH = 431;
  public static final int SANDSTONE_STAIRS_HIGH_EAST = 432;
  public static final int SANDSTONE_STAIRS_HIGH_WEST = 433;
  public static final int SANDSTONE_STAIRS_HIGH_SOUTH = 434;
  public static final int SANDSTONE_STAIRS_HIGH_NORTH = 435;
  public static final int PUMPKIN_WEST = 436;
  public static final int PUMPKIN_NORTH = 437;
  public static final int PUMPKIN_EAST = 438;
  public static final int PUMPKIN_NO_FACE = 439;
  public static final int JACK_WEST = 440;
  public static final int JACK_NORTH = 441;
  public static final int JACK_EAST = 442;
  public static final int JACK_NO_FACE = 443;
  public static final int SMALL_EAST_SOUTH = 445;
  public static final int SMALL_EAST_NORTH = 446;
  public static final int SMALL_WEST_SOUTH = 447;
  public static final int SMALL_WEST_NORTH = 448;
  public static final int BIG_EAST_SOUTH = 449;
  public static final int BIG_EAST_NORTH = 450;
  public static final int BIG_WEST_SOUTH = 451;
  public static final int BIG_WEST_NORTH = 452;
  public static final int EAST = 453;
  public static final int WEST = 454;
  public static final int NORTH = 455;
  public static final int SOUTH = 456;
  public static final int SMALL_EAST_SOUTH_RERUN = 457;
  public static final int SMALL_EAST_NORTH_RERUN = 458;
  public static final int SMALL_WEST_SOUTH_RERUN = 459;
  public static final int SMALL_WEST_NORTH_RERUN = 460;
  public static final int BIG_EAST_SOUTH_RERUN = 461;
  public static final int BIG_EAST_NORTH_RERUN = 462;
  public static final int BIG_WEST_SOUTH_RERUN = 463;
  public static final int BIG_WEST_NORTH_RERUN = 464;
  
  public Material() {}
}
