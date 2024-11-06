package willow.train.kuayue.systems.tech_tree.server;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import willow.train.kuayue.systems.tech_tree.NodeLocation;
import willow.train.kuayue.systems.tech_tree.json.HideContext;
import willow.train.kuayue.systems.tech_tree.json.ItemContext;
import willow.train.kuayue.systems.tech_tree.json.TechTreeGroupData;
import willow.train.kuayue.systems.tech_tree.json.TechTreeNodeData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TechTreeGroup {

    public final TechTreeGroupData data;

    public final TechTree tree;
    private final HashMap<NodeLocation, TechTreeNode> nodes;
    private final TechTreeNode root;
    private final ArrayList<TechTreeNode> prev;

    public TechTreeGroup(TechTree tree, TechTreeGroupData data) {
        this.data = data;
        this.tree = tree;
        nodes = new HashMap<>();
        prev = new ArrayList<>();
        collectNodes();
        tree.grepNodes(nodes);
        root = nodes.getOrDefault(data.getRootLocation(), null);
    }

    protected void collectNodes() {
        data.getNodes().forEach((loc, dat) -> {
            nodes.put(loc, new TechTreeNode(this, dat));
        });
    }

    protected void addPrev(TechTreeNode node) {
        prev.add(node);
    }

    public ArrayList<TechTreeNode> getPrev() {
        return prev;
    }

    public boolean isHide() {
        return data.isHide();
    }

    public ItemStack icon() {
        return data.getIcon();
    }

    public HideContext getHideContext() {
        return data.getHide();
    }

    public TechTreeNode getRoot() {
        return root;
    }

    public HashMap<NodeLocation, TechTreeNode> getNodes() {
        return nodes;
    }

    public String getIdentifier() {
        return data.identifier;
    }

    public String getNamespace() {
        return tree.getNamespace();
    }

    public boolean is(ResourceLocation location) {
        return data.getLocation().equals(location);
    }

    public boolean is(String str) {
        return data.getLocation().toString().equals(str);
    }
}
