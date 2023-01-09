/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package woyou.aidlservice.jiuiv5;
public interface IWoyouService extends android.os.IInterface
{
  /** Default implementation for IWoyouService. */
  public static class Default implements woyou.aidlservice.jiuiv5.IWoyouService
  {
    /**
        * 替换原打印机升级固件接口（void updateFirmware()）
        * 现更改为负载包名的数据接口，仅系统调用
        * 支持版本：4.0.0以上
        */
    @Override public boolean postPrintData(java.lang.String packageName, byte[] data, int offset, int length) throws android.os.RemoteException
    {
      return false;
    }
    /**
    	* 打印机固件状态
    	* 返回： 0--未知， A5--bootloader, C3--print
    	*/
    @Override public int getFirmwareStatus() throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 获取打印服务版本
       	* 返回： WoyouService服务版本
       	*/
    @Override public java.lang.String getServiceVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
    	 * 初始化打印机，重置打印机的逻辑程序，但不清空缓存区数据，因此
    	 * 未完成的打印作业将在重置后继续
    	 */
    @Override public void printerInit(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印机自检，打印机会打印自检页
    	*/
    @Override public void printerSelfChecking(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 获取打印机板序列号
    	* 返回：打印机板的序列号
    	*/
    @Override public java.lang.String getPrinterSerialNo() throws android.os.RemoteException
    {
      return null;
    }
    /**
    	* 获取打印机固件版本号
    	* 返回：打印机固件版本号
    	*/
    @Override public java.lang.String getPrinterVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
    	* 获取打印机型号
    	* 返回：打印机型号
    	*/
    @Override public java.lang.String getPrinterModal() throws android.os.RemoteException
    {
      return null;
    }
    /**
    	* 获取打印机上电后的打印长度
    	* callback onReturnString 中返回
    	*/
    @Override public void getPrintedLength(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	 * 打印机走纸(强制换行，结束之前的打印内容后走纸n行)
    	 * n: 走纸行数
    	 */
    @Override public void lineWrap(int n, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
        * epson指令打印
        */
    @Override public void sendRAWData(byte[] data, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 设置对齐模式，对之后打印有影响，除非初始化
    	* alignment: 对齐方式 0--居左 , 1--居中, 2--居右
    	*/
    @Override public void setAlignment(int alignment, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
        * 设置打印字体, 暂时仅能系统调用，外部调用无效
        */
    @Override public void setFontName(java.lang.String typeface, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 设置字体大小, 对之后打印有影响，除非初始化
    	* 注意：字体大小是超出标准国际指令的打印方式，
    	* 调整字体大小会影响字符宽度，每行字符数量也会随之改变，
    	* 因此按等宽字体形成的排版可能会错乱
    	* fontsize:	字体大小
    	*/
    @Override public void setFontSize(float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
    	* text:	要打印的文字字符串
    	*/
    @Override public void printText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
        * 打印指定字体的文本，字体设置只对本次有效
        * text:	要打印文字
       	* typeface: 字体名称（暂时仅能系统调用，外部调用无效）
       	* fontsize:	字体大小
       	*/
    @Override public void printTextWithFont(java.lang.String text, java.lang.String typeface, float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印表格的一行，可以指定列宽、对齐方式
    	* colsTextArr：   各列文本字符串数组
    	* colsWidthArr：  各列宽度数组(以英文字符计算, 每个中文字符占两个英文字符, 每个宽度大于0)
    	* colsAlign：     各列对齐方式(0居左, 1居中, 2居右)
    	* 备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
    	*/
    @Override public void printColumnsText(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印图片
    	* bitmap: 最大宽度384像素，超出宽度将显示不全；图片大小长*宽<8M；
    	*/
    @Override public void printBitmap(android.graphics.Bitmap bitmap, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印一维条码
    	* data: 		条码数据
    	* symbology: 	条码类型
    	*    0 -- UPC-A，		要求12位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
    	*    1 -- UPC-E，		要求8位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
    	*    2 -- JAN13(EAN13)，  要求13位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
    	*    3 -- JAN8(EAN8)，	要求8位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
    	*    4 -- CODE39，		数字英文及8个特殊符号且首尾为*号，但受限于打印机的宽度及条码宽度
    	*    5 -- ITF，			字符为数字且小于14位，但受限于打印机的宽度及条码宽度
    	*    6 -- CODABAR，		起始和终止必须为A-D，数据为0-9及6个特殊字符，长度任意但受限于打印机的宽度及条码宽度
    	*    7 -- CODE93，		字符任意，长度任意但受限于打印机的宽度及条码宽度
    	*    8 -- CODE128		字符任意，长度任意但受限于打印机的宽度及条码宽度
    	* height: 		条码高度, 取值1到255, 默认162
    	* width: 		条码宽度, 取值2至6, 默认2
    	* textposition:	文字位置 0--不打印文字, 1--文字在条码上方, 2--文字在条码下方, 3--条码上下方均打印
    	*/
    @Override public void printBarCode(java.lang.String data, int symbology, int height, int width, int textposition, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印二维条码
    	* data:			二维码数据
    	* modulesize:	二维码块大小(单位:点, 取值 1 至 16 )
    	* errorlevel:	二维码纠错等级(0 至 3)，
    	*               0 -- 纠错级别L ( 7%)，
    	*               1 -- 纠错级别M (15%)，
    	*               2 -- 纠错级别Q (25%)，
    	*               3 -- 纠错级别H (30%)
    	*/
    @Override public void printQRCode(java.lang.String data, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
    	* 文字按矢量文字宽度原样输出，即每个字符不等宽
    	* text:	要打印的文字字符串
    	*/
    @Override public void printOriginalText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* lib包打印专用接口
    	* transbean：打印任务列表
    	*/
    @Override public void commitPrint(com.sunmi.trans.TransBean[] transbean, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印缓冲区内容
    	*/
    @Override public void commitPrinterBuffer() throws android.os.RemoteException
    {
    }
    /**
    	* 进入事务模式，所有打印调用将缓存;
        * 调用commitPrinterBuffe()、exitPrinterBuffer(true)、commitPrinterBufferWithCallback()、
        * exitPrinterBufferWithCallback(true)后才进行打印；
        * clean: 如果之前没退出事务模式，是否清除已缓存的缓冲区内容
        */
    @Override public void enterPrinterBuffer(boolean clean) throws android.os.RemoteException
    {
    }
    /**
    	* 退出缓冲模式
    	* commit: 是否打印出缓冲区内容
    	*/
    @Override public void exitPrinterBuffer(boolean commit) throws android.os.RemoteException
    {
    }
    /**
        *   发送数控指令
        *   data：税控命令
        */
    @Override public void tax(byte[] data, woyou.aidlservice.jiuiv5.ITax callback) throws android.os.RemoteException
    {
    }
    /**
    	*   获取打印机头的型号
    	*   callback onReturnString 中返回
    	*/
    @Override public void getPrinterFactory(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
        *   清除打印机缓存数据（仅系统调用，外部调用无效）
        */
    @Override public void clearBuffer() throws android.os.RemoteException
    {
    }
    /**
    	* 带反馈打印缓冲区内容
    	*/
    @Override public void commitPrinterBufferWithCallback(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 带反馈退出缓冲打印模式
    	* commit： 是否提交缓冲区内容
    	*/
    @Override public void exitPrinterBufferWithCallback(boolean commit, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	* 打印表格的一行，可以指定列宽、对齐方式
    	* colsTextArr：   各列文本字符串数组
    	* colsWidthArr：  各列宽度权重即各列所占比例
    	* colsAlign：     各列对齐方式(0居左, 1居中, 2居右)
    	* 备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
    	*/
    @Override public void printColumnsString(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
    	*   获取打印机的最新状态
    	*   返回：打印机状态反馈 1正常 2准备中 3通信异常 4缺纸 5过热 505:无打印机 507：更新失败
    	*/
    @Override public int updatePrinterState() throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 自定义打印图片
        * bitmap:   图片bitmap对象(最大宽度384像素，图片超过1M无法打印)
        * type:     目前有两种打印方式：0、同printBitmap 1、阈值200的黑白化图片 2、灰度图片
        * 支持版本:   P1-v3.2.0以上
        *           P14g-v1.1.6以上
        *           V1s-v3.1.6以上
        *           V2-v1.0.0以上
        */
    @Override public void printBitmapCustom(android.graphics.Bitmap bitmap, int type, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
        * 获取强制启用字体加倍状态
        * 返回 0：未启用 1：倍宽 2：倍高 3：倍高倍宽
        * 支持版本:   P1-v3.2.0以上
        *           P14g-v1.2.0以上
        *           V1s-v3.2.0以上
        *           V2-v1.0.0以上
        */
    @Override public int getForcedDouble() throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 是否强制启用反白样式
        * 返回 true:启用 false：未启用
        * 支持版本:   P1-v3.2.0以上
        *           P14g-v1.2.0以上
        *           V1s-v3.2.0以上
        *           V2-v1.0.0以上
        */
    @Override public boolean isForcedAntiWhite() throws android.os.RemoteException
    {
      return false;
    }
    /**
        * 是否强制启用加粗样式
        * 返回 true:启用 false：未启用
        * 支持版本:   P1-v3.2.0以上
        *           P14g-v1.2.0以上
        *           V1s-v3.2.0以上
        *           V2-v1.0.0以上
        */
    @Override public boolean isForcedBold() throws android.os.RemoteException
    {
      return false;
    }
    /**
        * 是否强制启用下划线样式
        * 返回 true:启用 false：未启用
        * 支持版本:   P1-v3.2.0以上
        *           P14g-v1.2.0以上
        *           V1s-v3.2.0以上
        *           V2-v1.0.0以上
        */
    @Override public boolean isForcedUnderline() throws android.os.RemoteException
    {
      return false;
    }
    /**
        * 获取强制启用行高状态
        * 返回 -1:未启用 0~255：强制行高像素高度
        * 支持版本:   P1-v3.2.0以上
        *           P14g-v1.2.0以上
        *           V1s-v3.2.0以上
        *           V2-v1.0.0以上
        */
    @Override public int getForcedRowHeight() throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 获取当前字体
        * 返回 0：商米字体1.0 1：商米字体2.0
        * 支持版本:   P1-v3.2.0以上
        *           P14g-v1.2.0以上
        *           V1s-v3.2.0以上
        *           V2-v1.0.0以上
        */
    @Override public int getFontName() throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 获取当前打印浓度
        * 返回   -1：打印浓度不可用 非-1： 打印浓度值 %
        * 支持版本:   v4.1.0以上版本
        */
    @Override public int getPrinterDensity() throws android.os.RemoteException
    {
      return 0;
    }
    /**
        *   打印二维条码
        *   data:       条码内容    pdf417暂不支持中文
        *   symbolgy:   条码类型    1：Qr Code 2：PDF417
        *   modulesize: 块大小
        *   errorlevle: 纠错等级    Qr code：0～3
        *                          PDF417： 0~8
        *   支持版本:  v4.1.0以上
        */
    @Override public void print2DCode(java.lang.String data, int symbology, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
        *  台式打印机可以切换打印纸类型，此接口可以获取当前打印机支持的打印纸型号
        *  返回： 0: 80mm 1: 58mm
        *  支持版本：T1-v2.4.0以上
        *          T2、S2-v1.0.5以上
        *          其他 v4.1.2以上
        */
    @Override public int getPrinterPaper() throws android.os.RemoteException
    {
      return 0;
    }
    /**
        *   打印结束自动出纸（打印头到纸舱盖间的距离），如果有切刀会自动切刀
        *   支持版本：4.1.5以上
        */
    @Override public void autoOutPaper(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
    {
    }
    /**
        *   设置打印样式接口
        *   key         设置属性, 见WoyouConsts
        *   value       设置内容
        *   支持版本:v4.2.22以上
        */
    @Override public void setPrinterStyle(int key, int value) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements woyou.aidlservice.jiuiv5.IWoyouService
  {
    private static final java.lang.String DESCRIPTOR = "woyou.aidlservice.jiuiv5.IWoyouService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an woyou.aidlservice.jiuiv5.IWoyouService interface,
     * generating a proxy if needed.
     */
    public static woyou.aidlservice.jiuiv5.IWoyouService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof woyou.aidlservice.jiuiv5.IWoyouService))) {
        return ((woyou.aidlservice.jiuiv5.IWoyouService)iin);
      }
      return new woyou.aidlservice.jiuiv5.IWoyouService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_postPrintData:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          boolean _result = this.postPrintData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getFirmwareStatus:
        {
          data.enforceInterface(descriptor);
          int _result = this.getFirmwareStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getServiceVersion:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getServiceVersion();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_printerInit:
        {
          data.enforceInterface(descriptor);
          woyou.aidlservice.jiuiv5.ICallback _arg0;
          _arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printerInit(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printerSelfChecking:
        {
          data.enforceInterface(descriptor);
          woyou.aidlservice.jiuiv5.ICallback _arg0;
          _arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printerSelfChecking(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterSerialNo:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getPrinterSerialNo();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getPrinterVersion:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getPrinterVersion();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getPrinterModal:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getPrinterModal();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getPrintedLength:
        {
          data.enforceInterface(descriptor);
          woyou.aidlservice.jiuiv5.ICallback _arg0;
          _arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.getPrintedLength(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_lineWrap:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.lineWrap(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sendRAWData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.sendRAWData(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setAlignment:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.setAlignment(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.setFontName(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setFontSize:
        {
          data.enforceInterface(descriptor);
          float _arg0;
          _arg0 = data.readFloat();
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.setFontSize(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printText:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printText(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printTextWithFont:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          float _arg2;
          _arg2 = data.readFloat();
          woyou.aidlservice.jiuiv5.ICallback _arg3;
          _arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printTextWithFont(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printColumnsText:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          int[] _arg1;
          _arg1 = data.createIntArray();
          int[] _arg2;
          _arg2 = data.createIntArray();
          woyou.aidlservice.jiuiv5.ICallback _arg3;
          _arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printColumnsText(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBitmap:
        {
          data.enforceInterface(descriptor);
          android.graphics.Bitmap _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printBitmap(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printBarCode:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          woyou.aidlservice.jiuiv5.ICallback _arg5;
          _arg5 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printBarCode(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printQRCode:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          woyou.aidlservice.jiuiv5.ICallback _arg3;
          _arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printQRCode(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printOriginalText:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printOriginalText(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_commitPrint:
        {
          data.enforceInterface(descriptor);
          com.sunmi.trans.TransBean[] _arg0;
          _arg0 = data.createTypedArray(com.sunmi.trans.TransBean.CREATOR);
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.commitPrint(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_commitPrinterBuffer:
        {
          data.enforceInterface(descriptor);
          this.commitPrinterBuffer();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_enterPrinterBuffer:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.enterPrinterBuffer(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_exitPrinterBuffer:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.exitPrinterBuffer(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_tax:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          woyou.aidlservice.jiuiv5.ITax _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ITax.Stub.asInterface(data.readStrongBinder());
          this.tax(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterFactory:
        {
          data.enforceInterface(descriptor);
          woyou.aidlservice.jiuiv5.ICallback _arg0;
          _arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.getPrinterFactory(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_clearBuffer:
        {
          data.enforceInterface(descriptor);
          this.clearBuffer();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_commitPrinterBufferWithCallback:
        {
          data.enforceInterface(descriptor);
          woyou.aidlservice.jiuiv5.ICallback _arg0;
          _arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.commitPrinterBufferWithCallback(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_exitPrinterBufferWithCallback:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          woyou.aidlservice.jiuiv5.ICallback _arg1;
          _arg1 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.exitPrinterBufferWithCallback(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_printColumnsString:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          int[] _arg1;
          _arg1 = data.createIntArray();
          int[] _arg2;
          _arg2 = data.createIntArray();
          woyou.aidlservice.jiuiv5.ICallback _arg3;
          _arg3 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printColumnsString(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_updatePrinterState:
        {
          data.enforceInterface(descriptor);
          int _result = this.updatePrinterState();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_printBitmapCustom:
        {
          data.enforceInterface(descriptor);
          android.graphics.Bitmap _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          woyou.aidlservice.jiuiv5.ICallback _arg2;
          _arg2 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.printBitmapCustom(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getForcedDouble:
        {
          data.enforceInterface(descriptor);
          int _result = this.getForcedDouble();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_isForcedAntiWhite:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isForcedAntiWhite();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_isForcedBold:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isForcedBold();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_isForcedUnderline:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isForcedUnderline();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getForcedRowHeight:
        {
          data.enforceInterface(descriptor);
          int _result = this.getForcedRowHeight();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getFontName:
        {
          data.enforceInterface(descriptor);
          int _result = this.getFontName();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPrinterDensity:
        {
          data.enforceInterface(descriptor);
          int _result = this.getPrinterDensity();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_print2DCode:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          woyou.aidlservice.jiuiv5.ICallback _arg4;
          _arg4 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.print2DCode(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPrinterPaper:
        {
          data.enforceInterface(descriptor);
          int _result = this.getPrinterPaper();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_autoOutPaper:
        {
          data.enforceInterface(descriptor);
          woyou.aidlservice.jiuiv5.ICallback _arg0;
          _arg0 = woyou.aidlservice.jiuiv5.ICallback.Stub.asInterface(data.readStrongBinder());
          this.autoOutPaper(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setPrinterStyle:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setPrinterStyle(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements woyou.aidlservice.jiuiv5.IWoyouService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
          * 替换原打印机升级固件接口（void updateFirmware()）
          * 现更改为负载包名的数据接口，仅系统调用
          * 支持版本：4.0.0以上
          */
      @Override public boolean postPrintData(java.lang.String packageName, byte[] data, int offset, int length) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          _data.writeByteArray(data);
          _data.writeInt(offset);
          _data.writeInt(length);
          boolean _status = mRemote.transact(Stub.TRANSACTION_postPrintData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().postPrintData(packageName, data, offset, length);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
      	* 打印机固件状态
      	* 返回： 0--未知， A5--bootloader, C3--print
      	*/
      @Override public int getFirmwareStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFirmwareStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getFirmwareStatus();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取打印服务版本
         	* 返回： WoyouService服务版本
         	*/
      @Override public java.lang.String getServiceVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getServiceVersion();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
      	 * 初始化打印机，重置打印机的逻辑程序，但不清空缓存区数据，因此
      	 * 未完成的打印作业将在重置后继续
      	 */
      @Override public void printerInit(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printerInit, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printerInit(callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印机自检，打印机会打印自检页
      	*/
      @Override public void printerSelfChecking(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printerSelfChecking, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printerSelfChecking(callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 获取打印机板序列号
      	* 返回：打印机板的序列号
      	*/
      @Override public java.lang.String getPrinterSerialNo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterSerialNo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterSerialNo();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
      	* 获取打印机固件版本号
      	* 返回：打印机固件版本号
      	*/
      @Override public java.lang.String getPrinterVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterVersion();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
      	* 获取打印机型号
      	* 返回：打印机型号
      	*/
      @Override public java.lang.String getPrinterModal() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterModal, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterModal();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
      	* 获取打印机上电后的打印长度
      	* callback onReturnString 中返回
      	*/
      @Override public void getPrintedLength(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrintedLength, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrintedLength(callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * 打印机走纸(强制换行，结束之前的打印内容后走纸n行)
      	 * n: 走纸行数
      	 */
      @Override public void lineWrap(int n, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(n);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_lineWrap, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().lineWrap(n, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * epson指令打印
          */
      @Override public void sendRAWData(byte[] data, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendRAWData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sendRAWData(data, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 设置对齐模式，对之后打印有影响，除非初始化
      	* alignment: 对齐方式 0--居左 , 1--居中, 2--居右
      	*/
      @Override public void setAlignment(int alignment, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(alignment);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAlignment, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setAlignment(alignment, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * 设置打印字体, 暂时仅能系统调用，外部调用无效
          */
      @Override public void setFontName(java.lang.String typeface, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(typeface);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontName(typeface, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 设置字体大小, 对之后打印有影响，除非初始化
      	* 注意：字体大小是超出标准国际指令的打印方式，
      	* 调整字体大小会影响字符宽度，每行字符数量也会随之改变，
      	* 因此按等宽字体形成的排版可能会错乱
      	* fontsize:	字体大小
      	*/
      @Override public void setFontSize(float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(fontsize);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFontSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setFontSize(fontsize, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
      	* text:	要打印的文字字符串
      	*/
      @Override public void printText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(text);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printText, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printText(text, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * 打印指定字体的文本，字体设置只对本次有效
          * text:	要打印文字
         	* typeface: 字体名称（暂时仅能系统调用，外部调用无效）
         	* fontsize:	字体大小
         	*/
      @Override public void printTextWithFont(java.lang.String text, java.lang.String typeface, float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(text);
          _data.writeString(typeface);
          _data.writeFloat(fontsize);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printTextWithFont, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printTextWithFont(text, typeface, fontsize, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印表格的一行，可以指定列宽、对齐方式
      	* colsTextArr：   各列文本字符串数组
      	* colsWidthArr：  各列宽度数组(以英文字符计算, 每个中文字符占两个英文字符, 每个宽度大于0)
      	* colsAlign：     各列对齐方式(0居左, 1居中, 2居右)
      	* 备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
      	*/
      @Override public void printColumnsText(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(colsTextArr);
          _data.writeIntArray(colsWidthArr);
          _data.writeIntArray(colsAlign);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printColumnsText, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printColumnsText(colsTextArr, colsWidthArr, colsAlign, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印图片
      	* bitmap: 最大宽度384像素，超出宽度将显示不全；图片大小长*宽<8M；
      	*/
      @Override public void printBitmap(android.graphics.Bitmap bitmap, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bitmap!=null)) {
            _data.writeInt(1);
            bitmap.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBitmap, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBitmap(bitmap, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印一维条码
      	* data: 		条码数据
      	* symbology: 	条码类型
      	*    0 -- UPC-A，		要求12位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
      	*    1 -- UPC-E，		要求8位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
      	*    2 -- JAN13(EAN13)，  要求13位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
      	*    3 -- JAN8(EAN8)，	要求8位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
      	*    4 -- CODE39，		数字英文及8个特殊符号且首尾为*号，但受限于打印机的宽度及条码宽度
      	*    5 -- ITF，			字符为数字且小于14位，但受限于打印机的宽度及条码宽度
      	*    6 -- CODABAR，		起始和终止必须为A-D，数据为0-9及6个特殊字符，长度任意但受限于打印机的宽度及条码宽度
      	*    7 -- CODE93，		字符任意，长度任意但受限于打印机的宽度及条码宽度
      	*    8 -- CODE128		字符任意，长度任意但受限于打印机的宽度及条码宽度
      	* height: 		条码高度, 取值1到255, 默认162
      	* width: 		条码宽度, 取值2至6, 默认2
      	* textposition:	文字位置 0--不打印文字, 1--文字在条码上方, 2--文字在条码下方, 3--条码上下方均打印
      	*/
      @Override public void printBarCode(java.lang.String data, int symbology, int height, int width, int textposition, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          _data.writeInt(symbology);
          _data.writeInt(height);
          _data.writeInt(width);
          _data.writeInt(textposition);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBarCode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBarCode(data, symbology, height, width, textposition, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印二维条码
      	* data:			二维码数据
      	* modulesize:	二维码块大小(单位:点, 取值 1 至 16 )
      	* errorlevel:	二维码纠错等级(0 至 3)，
      	*               0 -- 纠错级别L ( 7%)，
      	*               1 -- 纠错级别M (15%)，
      	*               2 -- 纠错级别Q (25%)，
      	*               3 -- 纠错级别H (30%)
      	*/
      @Override public void printQRCode(java.lang.String data, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          _data.writeInt(modulesize);
          _data.writeInt(errorlevel);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printQRCode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printQRCode(data, modulesize, errorlevel, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
      	* 文字按矢量文字宽度原样输出，即每个字符不等宽
      	* text:	要打印的文字字符串
      	*/
      @Override public void printOriginalText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(text);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printOriginalText, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printOriginalText(text, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* lib包打印专用接口
      	* transbean：打印任务列表
      	*/
      @Override public void commitPrint(com.sunmi.trans.TransBean[] transbean, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedArray(transbean, 0);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_commitPrint, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().commitPrint(transbean, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印缓冲区内容
      	*/
      @Override public void commitPrinterBuffer() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_commitPrinterBuffer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().commitPrinterBuffer();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 进入事务模式，所有打印调用将缓存;
          * 调用commitPrinterBuffe()、exitPrinterBuffer(true)、commitPrinterBufferWithCallback()、
          * exitPrinterBufferWithCallback(true)后才进行打印；
          * clean: 如果之前没退出事务模式，是否清除已缓存的缓冲区内容
          */
      @Override public void enterPrinterBuffer(boolean clean) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((clean)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_enterPrinterBuffer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().enterPrinterBuffer(clean);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 退出缓冲模式
      	* commit: 是否打印出缓冲区内容
      	*/
      @Override public void exitPrinterBuffer(boolean commit) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((commit)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitPrinterBuffer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().exitPrinterBuffer(commit);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          *   发送数控指令
          *   data：税控命令
          */
      @Override public void tax(byte[] data, woyou.aidlservice.jiuiv5.ITax callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_tax, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().tax(data, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	*   获取打印机头的型号
      	*   callback onReturnString 中返回
      	*/
      @Override public void getPrinterFactory(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterFactory, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getPrinterFactory(callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          *   清除打印机缓存数据（仅系统调用，外部调用无效）
          */
      @Override public void clearBuffer() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearBuffer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().clearBuffer();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 带反馈打印缓冲区内容
      	*/
      @Override public void commitPrinterBufferWithCallback(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_commitPrinterBufferWithCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().commitPrinterBufferWithCallback(callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 带反馈退出缓冲打印模式
      	* commit： 是否提交缓冲区内容
      	*/
      @Override public void exitPrinterBufferWithCallback(boolean commit, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((commit)?(1):(0)));
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitPrinterBufferWithCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().exitPrinterBufferWithCallback(commit, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* 打印表格的一行，可以指定列宽、对齐方式
      	* colsTextArr：   各列文本字符串数组
      	* colsWidthArr：  各列宽度权重即各列所占比例
      	* colsAlign：     各列对齐方式(0居左, 1居中, 2居右)
      	* 备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
      	*/
      @Override public void printColumnsString(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(colsTextArr);
          _data.writeIntArray(colsWidthArr);
          _data.writeIntArray(colsAlign);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printColumnsString, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printColumnsString(colsTextArr, colsWidthArr, colsAlign, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	*   获取打印机的最新状态
      	*   返回：打印机状态反馈 1正常 2准备中 3通信异常 4缺纸 5过热 505:无打印机 507：更新失败
      	*/
      @Override public int updatePrinterState() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updatePrinterState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().updatePrinterState();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 自定义打印图片
          * bitmap:   图片bitmap对象(最大宽度384像素，图片超过1M无法打印)
          * type:     目前有两种打印方式：0、同printBitmap 1、阈值200的黑白化图片 2、灰度图片
          * 支持版本:   P1-v3.2.0以上
          *           P14g-v1.1.6以上
          *           V1s-v3.1.6以上
          *           V2-v1.0.0以上
          */
      @Override public void printBitmapCustom(android.graphics.Bitmap bitmap, int type, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bitmap!=null)) {
            _data.writeInt(1);
            bitmap.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(type);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBitmapCustom, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().printBitmapCustom(bitmap, type, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * 获取强制启用字体加倍状态
          * 返回 0：未启用 1：倍宽 2：倍高 3：倍高倍宽
          * 支持版本:   P1-v3.2.0以上
          *           P14g-v1.2.0以上
          *           V1s-v3.2.0以上
          *           V2-v1.0.0以上
          */
      @Override public int getForcedDouble() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getForcedDouble, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getForcedDouble();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 是否强制启用反白样式
          * 返回 true:启用 false：未启用
          * 支持版本:   P1-v3.2.0以上
          *           P14g-v1.2.0以上
          *           V1s-v3.2.0以上
          *           V2-v1.0.0以上
          */
      @Override public boolean isForcedAntiWhite() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isForcedAntiWhite, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isForcedAntiWhite();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 是否强制启用加粗样式
          * 返回 true:启用 false：未启用
          * 支持版本:   P1-v3.2.0以上
          *           P14g-v1.2.0以上
          *           V1s-v3.2.0以上
          *           V2-v1.0.0以上
          */
      @Override public boolean isForcedBold() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isForcedBold, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isForcedBold();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 是否强制启用下划线样式
          * 返回 true:启用 false：未启用
          * 支持版本:   P1-v3.2.0以上
          *           P14g-v1.2.0以上
          *           V1s-v3.2.0以上
          *           V2-v1.0.0以上
          */
      @Override public boolean isForcedUnderline() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isForcedUnderline, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isForcedUnderline();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取强制启用行高状态
          * 返回 -1:未启用 0~255：强制行高像素高度
          * 支持版本:   P1-v3.2.0以上
          *           P14g-v1.2.0以上
          *           V1s-v3.2.0以上
          *           V2-v1.0.0以上
          */
      @Override public int getForcedRowHeight() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getForcedRowHeight, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getForcedRowHeight();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取当前字体
          * 返回 0：商米字体1.0 1：商米字体2.0
          * 支持版本:   P1-v3.2.0以上
          *           P14g-v1.2.0以上
          *           V1s-v3.2.0以上
          *           V2-v1.0.0以上
          */
      @Override public int getFontName() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFontName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getFontName();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取当前打印浓度
          * 返回   -1：打印浓度不可用 非-1： 打印浓度值 %
          * 支持版本:   v4.1.0以上版本
          */
      @Override public int getPrinterDensity() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterDensity, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterDensity();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          *   打印二维条码
          *   data:       条码内容    pdf417暂不支持中文
          *   symbolgy:   条码类型    1：Qr Code 2：PDF417
          *   modulesize: 块大小
          *   errorlevle: 纠错等级    Qr code：0～3
          *                          PDF417： 0~8
          *   支持版本:  v4.1.0以上
          */
      @Override public void print2DCode(java.lang.String data, int symbology, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          _data.writeInt(symbology);
          _data.writeInt(modulesize);
          _data.writeInt(errorlevel);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_print2DCode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().print2DCode(data, symbology, modulesize, errorlevel, callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          *  台式打印机可以切换打印纸类型，此接口可以获取当前打印机支持的打印纸型号
          *  返回： 0: 80mm 1: 58mm
          *  支持版本：T1-v2.4.0以上
          *          T2、S2-v1.0.5以上
          *          其他 v4.1.2以上
          */
      @Override public int getPrinterPaper() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterPaper, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterPaper();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          *   打印结束自动出纸（打印头到纸舱盖间的距离），如果有切刀会自动切刀
          *   支持版本：4.1.5以上
          */
      @Override public void autoOutPaper(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_autoOutPaper, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().autoOutPaper(callback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          *   设置打印样式接口
          *   key         设置属性, 见WoyouConsts
          *   value       设置内容
          *   支持版本:v4.2.22以上
          */
      @Override public void setPrinterStyle(int key, int value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(key);
          _data.writeInt(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPrinterStyle, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPrinterStyle(key, value);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static woyou.aidlservice.jiuiv5.IWoyouService sDefaultImpl;
    }
    static final int TRANSACTION_postPrintData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getFirmwareStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_printerInit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_printerSelfChecking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getPrinterSerialNo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getPrinterVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getPrinterModal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getPrintedLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_lineWrap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_sendRAWData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_setAlignment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setFontName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_setFontSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_printText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_printTextWithFont = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_printColumnsText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_printBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_printBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_printQRCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_printOriginalText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_commitPrint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_commitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_enterPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_exitPrinterBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_tax = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_getPrinterFactory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_clearBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_commitPrinterBufferWithCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_exitPrinterBufferWithCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_printColumnsString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_updatePrinterState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_printBitmapCustom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_getForcedDouble = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_isForcedAntiWhite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_isForcedBold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_isForcedUnderline = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_getForcedRowHeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_getFontName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_getPrinterDensity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_print2DCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_getPrinterPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_autoOutPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_setPrinterStyle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    public static boolean setDefaultImpl(woyou.aidlservice.jiuiv5.IWoyouService impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static woyou.aidlservice.jiuiv5.IWoyouService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
      * 替换原打印机升级固件接口（void updateFirmware()）
      * 现更改为负载包名的数据接口，仅系统调用
      * 支持版本：4.0.0以上
      */
  public boolean postPrintData(java.lang.String packageName, byte[] data, int offset, int length) throws android.os.RemoteException;
  /**
  	* 打印机固件状态
  	* 返回： 0--未知， A5--bootloader, C3--print
  	*/
  public int getFirmwareStatus() throws android.os.RemoteException;
  /**
      * 获取打印服务版本
     	* 返回： WoyouService服务版本
     	*/
  public java.lang.String getServiceVersion() throws android.os.RemoteException;
  /**
  	 * 初始化打印机，重置打印机的逻辑程序，但不清空缓存区数据，因此
  	 * 未完成的打印作业将在重置后继续
  	 */
  public void printerInit(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印机自检，打印机会打印自检页
  	*/
  public void printerSelfChecking(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 获取打印机板序列号
  	* 返回：打印机板的序列号
  	*/
  public java.lang.String getPrinterSerialNo() throws android.os.RemoteException;
  /**
  	* 获取打印机固件版本号
  	* 返回：打印机固件版本号
  	*/
  public java.lang.String getPrinterVersion() throws android.os.RemoteException;
  /**
  	* 获取打印机型号
  	* 返回：打印机型号
  	*/
  public java.lang.String getPrinterModal() throws android.os.RemoteException;
  /**
  	* 获取打印机上电后的打印长度
  	* callback onReturnString 中返回
  	*/
  public void getPrintedLength(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	 * 打印机走纸(强制换行，结束之前的打印内容后走纸n行)
  	 * n: 走纸行数
  	 */
  public void lineWrap(int n, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
      * epson指令打印
      */
  public void sendRAWData(byte[] data, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 设置对齐模式，对之后打印有影响，除非初始化
  	* alignment: 对齐方式 0--居左 , 1--居中, 2--居右
  	*/
  public void setAlignment(int alignment, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
      * 设置打印字体, 暂时仅能系统调用，外部调用无效
      */
  public void setFontName(java.lang.String typeface, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 设置字体大小, 对之后打印有影响，除非初始化
  	* 注意：字体大小是超出标准国际指令的打印方式，
  	* 调整字体大小会影响字符宽度，每行字符数量也会随之改变，
  	* 因此按等宽字体形成的排版可能会错乱
  	* fontsize:	字体大小
  	*/
  public void setFontSize(float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
  	* text:	要打印的文字字符串
  	*/
  public void printText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
      * 打印指定字体的文本，字体设置只对本次有效
      * text:	要打印文字
     	* typeface: 字体名称（暂时仅能系统调用，外部调用无效）
     	* fontsize:	字体大小
     	*/
  public void printTextWithFont(java.lang.String text, java.lang.String typeface, float fontsize, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印表格的一行，可以指定列宽、对齐方式
  	* colsTextArr：   各列文本字符串数组
  	* colsWidthArr：  各列宽度数组(以英文字符计算, 每个中文字符占两个英文字符, 每个宽度大于0)
  	* colsAlign：     各列对齐方式(0居左, 1居中, 2居右)
  	* 备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
  	*/
  public void printColumnsText(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印图片
  	* bitmap: 最大宽度384像素，超出宽度将显示不全；图片大小长*宽<8M；
  	*/
  public void printBitmap(android.graphics.Bitmap bitmap, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印一维条码
  	* data: 		条码数据
  	* symbology: 	条码类型
  	*    0 -- UPC-A，		要求12位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
  	*    1 -- UPC-E，		要求8位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
  	*    2 -- JAN13(EAN13)，  要求13位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
  	*    3 -- JAN8(EAN8)，	要求8位数字（最后一位校验位必须正确），但受限于打印机的宽度及条码宽度
  	*    4 -- CODE39，		数字英文及8个特殊符号且首尾为*号，但受限于打印机的宽度及条码宽度
  	*    5 -- ITF，			字符为数字且小于14位，但受限于打印机的宽度及条码宽度
  	*    6 -- CODABAR，		起始和终止必须为A-D，数据为0-9及6个特殊字符，长度任意但受限于打印机的宽度及条码宽度
  	*    7 -- CODE93，		字符任意，长度任意但受限于打印机的宽度及条码宽度
  	*    8 -- CODE128		字符任意，长度任意但受限于打印机的宽度及条码宽度
  	* height: 		条码高度, 取值1到255, 默认162
  	* width: 		条码宽度, 取值2至6, 默认2
  	* textposition:	文字位置 0--不打印文字, 1--文字在条码上方, 2--文字在条码下方, 3--条码上下方均打印
  	*/
  public void printBarCode(java.lang.String data, int symbology, int height, int width, int textposition, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印二维条码
  	* data:			二维码数据
  	* modulesize:	二维码块大小(单位:点, 取值 1 至 16 )
  	* errorlevel:	二维码纠错等级(0 至 3)，
  	*               0 -- 纠错级别L ( 7%)，
  	*               1 -- 纠错级别M (15%)，
  	*               2 -- 纠错级别Q (25%)，
  	*               3 -- 纠错级别H (30%)
  	*/
  public void printQRCode(java.lang.String data, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印文字，文字宽度满一行自动换行排版，不满一整行不打印除非强制换行
  	* 文字按矢量文字宽度原样输出，即每个字符不等宽
  	* text:	要打印的文字字符串
  	*/
  public void printOriginalText(java.lang.String text, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* lib包打印专用接口
  	* transbean：打印任务列表
  	*/
  public void commitPrint(com.sunmi.trans.TransBean[] transbean, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印缓冲区内容
  	*/
  public void commitPrinterBuffer() throws android.os.RemoteException;
  /**
  	* 进入事务模式，所有打印调用将缓存;
      * 调用commitPrinterBuffe()、exitPrinterBuffer(true)、commitPrinterBufferWithCallback()、
      * exitPrinterBufferWithCallback(true)后才进行打印；
      * clean: 如果之前没退出事务模式，是否清除已缓存的缓冲区内容
      */
  public void enterPrinterBuffer(boolean clean) throws android.os.RemoteException;
  /**
  	* 退出缓冲模式
  	* commit: 是否打印出缓冲区内容
  	*/
  public void exitPrinterBuffer(boolean commit) throws android.os.RemoteException;
  /**
      *   发送数控指令
      *   data：税控命令
      */
  public void tax(byte[] data, woyou.aidlservice.jiuiv5.ITax callback) throws android.os.RemoteException;
  /**
  	*   获取打印机头的型号
  	*   callback onReturnString 中返回
  	*/
  public void getPrinterFactory(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
      *   清除打印机缓存数据（仅系统调用，外部调用无效）
      */
  public void clearBuffer() throws android.os.RemoteException;
  /**
  	* 带反馈打印缓冲区内容
  	*/
  public void commitPrinterBufferWithCallback(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 带反馈退出缓冲打印模式
  	* commit： 是否提交缓冲区内容
  	*/
  public void exitPrinterBufferWithCallback(boolean commit, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	* 打印表格的一行，可以指定列宽、对齐方式
  	* colsTextArr：   各列文本字符串数组
  	* colsWidthArr：  各列宽度权重即各列所占比例
  	* colsAlign：     各列对齐方式(0居左, 1居中, 2居右)
  	* 备注: 三个参数的数组长度应该一致, 如果colsText[i]的宽度大于colsWidth[i], 则文本换行
  	*/
  public void printColumnsString(java.lang.String[] colsTextArr, int[] colsWidthArr, int[] colsAlign, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
  	*   获取打印机的最新状态
  	*   返回：打印机状态反馈 1正常 2准备中 3通信异常 4缺纸 5过热 505:无打印机 507：更新失败
  	*/
  public int updatePrinterState() throws android.os.RemoteException;
  /**
      * 自定义打印图片
      * bitmap:   图片bitmap对象(最大宽度384像素，图片超过1M无法打印)
      * type:     目前有两种打印方式：0、同printBitmap 1、阈值200的黑白化图片 2、灰度图片
      * 支持版本:   P1-v3.2.0以上
      *           P14g-v1.1.6以上
      *           V1s-v3.1.6以上
      *           V2-v1.0.0以上
      */
  public void printBitmapCustom(android.graphics.Bitmap bitmap, int type, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
      * 获取强制启用字体加倍状态
      * 返回 0：未启用 1：倍宽 2：倍高 3：倍高倍宽
      * 支持版本:   P1-v3.2.0以上
      *           P14g-v1.2.0以上
      *           V1s-v3.2.0以上
      *           V2-v1.0.0以上
      */
  public int getForcedDouble() throws android.os.RemoteException;
  /**
      * 是否强制启用反白样式
      * 返回 true:启用 false：未启用
      * 支持版本:   P1-v3.2.0以上
      *           P14g-v1.2.0以上
      *           V1s-v3.2.0以上
      *           V2-v1.0.0以上
      */
  public boolean isForcedAntiWhite() throws android.os.RemoteException;
  /**
      * 是否强制启用加粗样式
      * 返回 true:启用 false：未启用
      * 支持版本:   P1-v3.2.0以上
      *           P14g-v1.2.0以上
      *           V1s-v3.2.0以上
      *           V2-v1.0.0以上
      */
  public boolean isForcedBold() throws android.os.RemoteException;
  /**
      * 是否强制启用下划线样式
      * 返回 true:启用 false：未启用
      * 支持版本:   P1-v3.2.0以上
      *           P14g-v1.2.0以上
      *           V1s-v3.2.0以上
      *           V2-v1.0.0以上
      */
  public boolean isForcedUnderline() throws android.os.RemoteException;
  /**
      * 获取强制启用行高状态
      * 返回 -1:未启用 0~255：强制行高像素高度
      * 支持版本:   P1-v3.2.0以上
      *           P14g-v1.2.0以上
      *           V1s-v3.2.0以上
      *           V2-v1.0.0以上
      */
  public int getForcedRowHeight() throws android.os.RemoteException;
  /**
      * 获取当前字体
      * 返回 0：商米字体1.0 1：商米字体2.0
      * 支持版本:   P1-v3.2.0以上
      *           P14g-v1.2.0以上
      *           V1s-v3.2.0以上
      *           V2-v1.0.0以上
      */
  public int getFontName() throws android.os.RemoteException;
  /**
      * 获取当前打印浓度
      * 返回   -1：打印浓度不可用 非-1： 打印浓度值 %
      * 支持版本:   v4.1.0以上版本
      */
  public int getPrinterDensity() throws android.os.RemoteException;
  /**
      *   打印二维条码
      *   data:       条码内容    pdf417暂不支持中文
      *   symbolgy:   条码类型    1：Qr Code 2：PDF417
      *   modulesize: 块大小
      *   errorlevle: 纠错等级    Qr code：0～3
      *                          PDF417： 0~8
      *   支持版本:  v4.1.0以上
      */
  public void print2DCode(java.lang.String data, int symbology, int modulesize, int errorlevel, woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
      *  台式打印机可以切换打印纸类型，此接口可以获取当前打印机支持的打印纸型号
      *  返回： 0: 80mm 1: 58mm
      *  支持版本：T1-v2.4.0以上
      *          T2、S2-v1.0.5以上
      *          其他 v4.1.2以上
      */
  public int getPrinterPaper() throws android.os.RemoteException;
  /**
      *   打印结束自动出纸（打印头到纸舱盖间的距离），如果有切刀会自动切刀
      *   支持版本：4.1.5以上
      */
  public void autoOutPaper(woyou.aidlservice.jiuiv5.ICallback callback) throws android.os.RemoteException;
  /**
      *   设置打印样式接口
      *   key         设置属性, 见WoyouConsts
      *   value       设置内容
      *   支持版本:v4.2.22以上
      */
  public void setPrinterStyle(int key, int value) throws android.os.RemoteException;
}
