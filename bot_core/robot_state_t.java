/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package bot_core;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class robot_state_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public bot_core.position_3d_t pose;
    public bot_core.twist_t twist;
    public short num_joints;
    public String joint_name[];
    public float joint_position[];
    public float joint_velocity[];
    public float joint_effort[];
    public bot_core.force_torque_t force_torque;
 
    public robot_state_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0xb1235f2940339effL;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(bot_core.robot_state_t.class))
            return 0L;
 
        classes.add(bot_core.robot_state_t.class);
        long hash = LCM_FINGERPRINT_BASE
             + bot_core.position_3d_t._hashRecursive(classes)
             + bot_core.twist_t._hashRecursive(classes)
             + bot_core.force_torque_t._hashRecursive(classes)
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
        char[] __strbuf = null;
        outs.writeLong(this.utime); 
 
        this.pose._encodeRecursive(outs); 
 
        this.twist._encodeRecursive(outs); 
 
        outs.writeShort(this.num_joints); 
 
        for (int a = 0; a < this.num_joints; a++) {
            __strbuf = new char[this.joint_name[a].length()]; this.joint_name[a].getChars(0, this.joint_name[a].length(), __strbuf, 0); outs.writeInt(__strbuf.length+1); for (int _i = 0; _i < __strbuf.length; _i++) outs.write(__strbuf[_i]); outs.writeByte(0); 
        }
 
        for (int a = 0; a < this.num_joints; a++) {
            outs.writeFloat(this.joint_position[a]); 
        }
 
        for (int a = 0; a < this.num_joints; a++) {
            outs.writeFloat(this.joint_velocity[a]); 
        }
 
        for (int a = 0; a < this.num_joints; a++) {
            outs.writeFloat(this.joint_effort[a]); 
        }
 
        this.force_torque._encodeRecursive(outs); 
 
    }
 
    public robot_state_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public robot_state_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static bot_core.robot_state_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        bot_core.robot_state_t o = new bot_core.robot_state_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        char[] __strbuf = null;
        this.utime = ins.readLong();
 
        this.pose = bot_core.position_3d_t._decodeRecursiveFactory(ins);
 
        this.twist = bot_core.twist_t._decodeRecursiveFactory(ins);
 
        this.num_joints = ins.readShort();
 
        this.joint_name = new String[(int) num_joints];
        for (int a = 0; a < this.num_joints; a++) {
            __strbuf = new char[ins.readInt()-1]; for (int _i = 0; _i < __strbuf.length; _i++) __strbuf[_i] = (char) (ins.readByte()&0xff); ins.readByte(); this.joint_name[a] = new String(__strbuf);
        }
 
        this.joint_position = new float[(int) num_joints];
        for (int a = 0; a < this.num_joints; a++) {
            this.joint_position[a] = ins.readFloat();
        }
 
        this.joint_velocity = new float[(int) num_joints];
        for (int a = 0; a < this.num_joints; a++) {
            this.joint_velocity[a] = ins.readFloat();
        }
 
        this.joint_effort = new float[(int) num_joints];
        for (int a = 0; a < this.num_joints; a++) {
            this.joint_effort[a] = ins.readFloat();
        }
 
        this.force_torque = bot_core.force_torque_t._decodeRecursiveFactory(ins);
 
    }
 
    public bot_core.robot_state_t copy()
    {
        bot_core.robot_state_t outobj = new bot_core.robot_state_t();
        outobj.utime = this.utime;
 
        outobj.pose = this.pose.copy();
 
        outobj.twist = this.twist.copy();
 
        outobj.num_joints = this.num_joints;
 
        outobj.joint_name = new String[(int) num_joints];
        if (this.num_joints > 0)
            System.arraycopy(this.joint_name, 0, outobj.joint_name, 0, this.num_joints); 
        outobj.joint_position = new float[(int) num_joints];
        if (this.num_joints > 0)
            System.arraycopy(this.joint_position, 0, outobj.joint_position, 0, this.num_joints); 
        outobj.joint_velocity = new float[(int) num_joints];
        if (this.num_joints > 0)
            System.arraycopy(this.joint_velocity, 0, outobj.joint_velocity, 0, this.num_joints); 
        outobj.joint_effort = new float[(int) num_joints];
        if (this.num_joints > 0)
            System.arraycopy(this.joint_effort, 0, outobj.joint_effort, 0, this.num_joints); 
        outobj.force_torque = this.force_torque.copy();
 
        return outobj;
    }
 
}

