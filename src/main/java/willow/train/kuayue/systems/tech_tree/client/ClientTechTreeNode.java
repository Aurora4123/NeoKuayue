package willow.train.kuayue.systems.tech_tree.client;

import lombok.Getter;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import willow.train.kuayue.systems.tech_tree.NodeLocation;
import willow.train.kuayue.systems.tech_tree.NodeType;

import java.util.HashSet;
import java.util.Set;

@Getter
public class ClientTechTreeNode {

    public final NodeLocation location;

    private final NodeType type;

    private final String name, description;

    private final Set<ItemStack> itemConsume;

    private final ItemStack logo;

    private final Set<NodeLocation> next;
    private final Set<NodeLocation> prev;

    private final Set<ClientTechTreeNode> nextNode;
    private final Set<ClientTechTreeNode> prevNode;
    private final Set<ResourceLocation> nextGroups;

    public ClientTechTreeNode(FriendlyByteBuf buf) {
        location = NodeLocation.readFromByteBuf(buf);
        type = NodeType.readFromByteBuf(buf);
        name = buf.readUtf();
        description = buf.readUtf();
        logo = buf.readItem();

        itemConsume = new HashSet<>();
        next = new HashSet<>();
        prev = new HashSet<>();
        nextGroups = new HashSet<>();

        int consumeCount = buf.readInt();
        for (int i = 0; i < consumeCount; i++) {
            itemConsume.add(buf.readItem());
        }

        int nodeCount = buf.readInt();
        for (int i = 0; i < nodeCount; i++) {
            next.add(NodeLocation.readFromByteBuf(buf));
        }

        int nextGroupCount = buf.readInt();
        for (int i = 0; i < nextGroupCount; i++) {
            nextGroups.add(new ResourceLocation(buf.readUtf()));
        }

        int prevCount = buf.readInt();
        for (int i = 0; i < prevCount; i++) {
            prev.add(NodeLocation.readFromByteBuf(buf));
        }

        nextNode = new HashSet<>();
        prevNode = new HashSet<>();
    }
}
