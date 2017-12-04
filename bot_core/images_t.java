/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class images_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public int n_images;
    public short image_types[];
    public bot_core.image_t images[];
 
    public images_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xfbe98784e0a4fbadL;
 
    public static final short LEFT = (short) 0;
    public static final short RIGHT = (short) 1;
    public static final short DISPARITY = (short) 2;
    public static final short MASK_ZIPPED = (short) 3;
    public static final short DEPTH_MM = (short) 4;
    public static final short DISPARITY_ZIPPED = (short) 5;
    public static final short DEPTH_MM_ZIPPED = (short) 6;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.images_t.class))
            return 0L;
 
        classes.add(bot_core.images_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + bot_core.image_t._hashRecursive(classes)
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
        outs.writeLong(this.utime); 
 
        outs.writeInt(this.n_images); 
 
        for (int a = 0; a < this.n_images; a++) {
            outs.writeShort(this.image_types[a]); 
        }
 
        for (int a = 0; a < this.n_images; a++) {
            this.images[a]._encodeRecursive(outs); 
        }
 
    }
 
    public images_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public images_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.images_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.images_t o = new bot_core.images_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.n_images = ins.readInt();
 
        this.image_types = new short[(int) n_images];
        for (int a = 0; a < this.n_images; a++) {
            this.image_types[a] = ins.readShort();
        }
 
        this.images = new bot_core.image_t[(int) n_images];
        for (int a = 0; a < this.n_images; a++) {
            this.images[a] = bot_core.image_t._decodeRecursiveFactory(ins);
        }
 
    }
 
    public bot_core.images_t copy()
    {
        bot_core.images_t outobj = new bot_core.images_t();
        outobj.utime = this.utime;
 
        outobj.n_images = this.n_images;
 
        outobj.image_types = new short[(int) n_images];
        if (this.n_images > 0)
            System.arraycopy(this.image_types, 0, outobj.image_types, 0, this.n_images); 
        outobj.images = new bot_core.image_t[(int) n_images];
        for (int a = 0; a < this.n_images; a++) {
            outobj.images[a] = this.images[a].copy();
        }
 
        return outobj;
    }
 
}
