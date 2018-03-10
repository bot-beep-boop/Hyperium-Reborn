/*
 *  Hypixel Community Client, Client optimized for Hypixel Network
 *     Copyright (C) 2018  Hyperium Dev Team
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published
 *     by the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.hyperium.mods.utilities;

import cc.hyperium.Hyperium;
import cc.hyperium.handlers.handlers.keybinds.HyperiumBind;
import cc.hyperium.mods.AbstractMod;
import cc.hyperium.utils.ChatColor;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

public class UtilitiesMod extends AbstractMod {
    
    private final Metadata metadata;
    
    private final HyperiumBind binding = new HyperiumBind("Zoom", Keyboard.KEY_C, "Utilities");
    
    public UtilitiesMod() {
        Metadata metadata = new Metadata(this, "Utilities", "1.0", "boomboompower");
    
        metadata.setDisplayName(ChatColor.AQUA + "Utilities");
    
        this.metadata = metadata;
    }
    
    @Override
    public AbstractMod init() {
    
        Hyperium.INSTANCE.getHandlers().getKeybindHandler().registerKeyBinding(this.binding);
        
        return this;
    }
    
    @Override
    public Metadata getModMetadata() {
        return this.metadata;
    }
    
    public KeyBinding getBinding() {
        return this.binding;
    }
}