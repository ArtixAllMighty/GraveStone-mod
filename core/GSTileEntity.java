
package gravestone.core;

import cpw.mods.fml.common.registry.GameRegistry;
import gravestone.tileentity.TileEntityGSHauntedChest;
import gravestone.tileentity.TileEntityGSGraveStone;
import gravestone.tileentity.TileEntityGSMemorial;
import gravestone.tileentity.TileEntityGSSkullCandle;
import gravestone.tileentity.TileEntityGSSpawner;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class GSTileEntity {

    private GSTileEntity() {
        
    }
    
    public static void registration() {
        GameRegistry.registerTileEntity(TileEntityGSGraveStone.class, "GraveStoneTE");
        
        GameRegistry.registerTileEntity(TileEntityGSMemorial.class, "Memorial");
        
        GameRegistry.registerTileEntity(TileEntityGSSpawner.class, "GS Spawner");
        
        GameRegistry.registerTileEntity(TileEntityGSHauntedChest.class, "GSHaunted Chest");
        
        GameRegistry.registerTileEntity(TileEntityGSSkullCandle.class, "GSSkull Candle");
    }
}
