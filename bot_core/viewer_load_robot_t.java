/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class viewer_load_robot_t implements lcm.lcm.LCMEncodable
{
    public int num_links;
    public bot_core.viewer_link_data_t link[];
 
    public viewer_load_robot_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x739e6927d8bcec39L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.viewer_load_robot_t.class))
            return 0L;
 
        classes.add(bot_core.viewer_load_robot_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + bot_core.viewer_link_data_t._hashRecursive(classes)
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeInt(this.num_links); 
 
        for (int a = 0; a < this.num_links; a++) {
            this.link[a]._encodeRecursive(outs); 
        }
 
    }
 
    public viewer_load_robot_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public viewer_load_robot_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.viewer_load_robot_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.viewer_load_robot_t o = new bot_core.viewer_load_robot_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.num_links = ins.readInt();
 
        this.link = new bot_core.viewer_link_data_t[(int) num_links];
        for (int a = 0; a < this.num_links; a++) {
            this.link[a] = bot_core.viewer_link_data_t._decodeRecursiveFactory(ins);
        }
 
    }
 
    public bot_core.viewer_load_robot_t copy()
    {
        bot_core.viewer_load_robot_t outobj = new bot_core.viewer_load_robot_t();
        outobj.num_links = this.num_links;
 
        outobj.link = new bot_core.viewer_link_data_t[(int) num_links];
        for (int a = 0; a < this.num_links; a++) {
            outobj.link[a] = this.link[a].copy();
        }
 
        return outobj;
    }
 
}

