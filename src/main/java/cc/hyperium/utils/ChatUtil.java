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

package cc.hyperium.utils;

import cc.hyperium.mixins.packet.MixinC01PacketChatMessage;
import me.kbrewster.mojangapi.MojangAPI;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.C01PacketChatMessage;

public class ChatUtil {

    public static void sendMessage(String msg) {
        final C01PacketChatMessage packet = new C01PacketChatMessage(msg);
        ((MixinC01PacketChatMessage) packet).setMessage(msg);
        Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(packet);
    }
}