// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.


package com.lib.ui.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class sqlite3_rtree_query_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public sqlite3_rtree_query_info() {
		super(sqlite3_rtree_query_info.class);
	}

	@Generated
	protected sqlite3_rtree_query_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr pContext();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setPContext(VoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int nParam();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNParam(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native DoublePtr aParam();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAParam(DoublePtr value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native VoidPtr pUser();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setPUser(VoidPtr value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@FunctionPtr(name = "call_xDelUser")
	public native Function_xDelUser xDelUser();

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_xDelUser {
		@Generated
		public void call_xDelUser(VoidPtr arg0);
	}

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setXDelUser(
			@FunctionPtr(name = "call_xDelUser") Function_xDelUser value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native DoublePtr aCoord();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setACoord(DoublePtr value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native IntPtr anQueue();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setAnQueue(IntPtr value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int nCoord();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setNCoord(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int iLevel();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setILevel(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int mxLevel();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setMxLevel(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native long iRowid();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setIRowid(long value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native double rParentScore();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setRParentScore(double value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int eParentWithin();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setEParentWithin(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int eWithin();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setEWithin(int value);

	@Generated
	@StructureField(order = 14, isGetter = true)
	public native double rScore();

	@Generated
	@StructureField(order = 14, isGetter = false)
	public native void setRScore(double value);

	@Generated
	@StructureField(order = 15, isGetter = true)
	@ReferenceInfo(type = Void.class, depth = 2)
	public native Ptr<VoidPtr> apSqlParam();

	@Generated
	@StructureField(order = 15, isGetter = false)
	public native void setApSqlParam(Ptr<VoidPtr> value);
}