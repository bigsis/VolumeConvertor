
package ku.vc.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Volumes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Volumes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="acreFoot"/>
 *     &lt;enumeration value="acreFootUSSurvey"/>
 *     &lt;enumeration value="acreInch"/>
 *     &lt;enumeration value="barrelUKwine"/>
 *     &lt;enumeration value="barrelUK"/>
 *     &lt;enumeration value="barrelUSDry"/>
 *     &lt;enumeration value="barrelUSFederal"/>
 *     &lt;enumeration value="barrelUSLiquid"/>
 *     &lt;enumeration value="barrelUSPetroleum"/>
 *     &lt;enumeration value="barrelUSSpirits"/>
 *     &lt;enumeration value="boardFoot"/>
 *     &lt;enumeration value="bucketUK"/>
 *     &lt;enumeration value="bushelUK"/>
 *     &lt;enumeration value="bushelUS"/>
 *     &lt;enumeration value="dry"/>
 *     &lt;enumeration value="centiliter"/>
 *     &lt;enumeration value="cordFirewood"/>
 *     &lt;enumeration value="cordFootTimber"/>
 *     &lt;enumeration value="cubicCentimeterCC"/>
 *     &lt;enumeration value="cubicCubitAncientEgypt"/>
 *     &lt;enumeration value="cubicDecimeter"/>
 *     &lt;enumeration value="cubicDekameter"/>
 *     &lt;enumeration value="cubicFoot"/>
 *     &lt;enumeration value="cubicInch"/>
 *     &lt;enumeration value="cubicKilometer"/>
 *     &lt;enumeration value="cubicMeter"/>
 *     &lt;enumeration value="cubicMile"/>
 *     &lt;enumeration value="cubicMillimeter"/>
 *     &lt;enumeration value="cubicYard"/>
 *     &lt;enumeration value="cupCanada"/>
 *     &lt;enumeration value="cupMetric"/>
 *     &lt;enumeration value="cupUS"/>
 *     &lt;enumeration value="deciliter"/>
 *     &lt;enumeration value="dekaliter"/>
 *     &lt;enumeration value="fifth"/>
 *     &lt;enumeration value="gallonUK"/>
 *     &lt;enumeration value="gallonUSDry"/>
 *     &lt;enumeration value="gallonUSLiquid"/>
 *     &lt;enumeration value="gillUK"/>
 *     &lt;enumeration value="gillUS"/>
 *     &lt;enumeration value="hectareMeter"/>
 *     &lt;enumeration value="hectoliter"/>
 *     &lt;enumeration value="hogsheadUK"/>
 *     &lt;enumeration value="hogsheadUS"/>
 *     &lt;enumeration value="jigger"/>
 *     &lt;enumeration value="kiloliter"/>
 *     &lt;enumeration value="liter"/>
 *     &lt;enumeration value="measureAncientHebrew"/>
 *     &lt;enumeration value="megaliter"/>
 *     &lt;enumeration value="microliter"/>
 *     &lt;enumeration value="milliliter"/>
 *     &lt;enumeration value="ounceUKLiquid"/>
 *     &lt;enumeration value="ounceUSLiquid"/>
 *     &lt;enumeration value="peckUK"/>
 *     &lt;enumeration value="peckUS"/>
 *     &lt;enumeration value="pintUK"/>
 *     &lt;enumeration value="pintUSDry"/>
 *     &lt;enumeration value="pintUSLiquid"/>
 *     &lt;enumeration value="pipeUK"/>
 *     &lt;enumeration value="pipeUS"/>
 *     &lt;enumeration value="pony"/>
 *     &lt;enumeration value="quartGermany"/>
 *     &lt;enumeration value="quartAncientHebrew"/>
 *     &lt;enumeration value="quartUK"/>
 *     &lt;enumeration value="quartUSDry"/>
 *     &lt;enumeration value="quartUSLiquid"/>
 *     &lt;enumeration value="quarterUKLiquid"/>
 *     &lt;enumeration value="scrupleUKLiquid"/>
 *     &lt;enumeration value="stere"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Volumes")
@XmlEnum
public enum Volumes {

    @XmlEnumValue("acreFoot")
    ACRE_FOOT("acreFoot"),
    @XmlEnumValue("acreFootUSSurvey")
    ACRE_FOOT_US_SURVEY("acreFootUSSurvey"),
    @XmlEnumValue("acreInch")
    ACRE_INCH("acreInch"),
    @XmlEnumValue("barrelUKwine")
    BARREL_U_KWINE("barrelUKwine"),
    @XmlEnumValue("barrelUK")
    BARREL_UK("barrelUK"),
    @XmlEnumValue("barrelUSDry")
    BARREL_US_DRY("barrelUSDry"),
    @XmlEnumValue("barrelUSFederal")
    BARREL_US_FEDERAL("barrelUSFederal"),
    @XmlEnumValue("barrelUSLiquid")
    BARREL_US_LIQUID("barrelUSLiquid"),
    @XmlEnumValue("barrelUSPetroleum")
    BARREL_US_PETROLEUM("barrelUSPetroleum"),
    @XmlEnumValue("barrelUSSpirits")
    BARREL_US_SPIRITS("barrelUSSpirits"),
    @XmlEnumValue("boardFoot")
    BOARD_FOOT("boardFoot"),
    @XmlEnumValue("bucketUK")
    BUCKET_UK("bucketUK"),
    @XmlEnumValue("bushelUK")
    BUSHEL_UK("bushelUK"),
    @XmlEnumValue("bushelUS")
    BUSHEL_US("bushelUS"),
    @XmlEnumValue("dry")
    DRY("dry"),
    @XmlEnumValue("centiliter")
    CENTILITER("centiliter"),
    @XmlEnumValue("cordFirewood")
    CORD_FIREWOOD("cordFirewood"),
    @XmlEnumValue("cordFootTimber")
    CORD_FOOT_TIMBER("cordFootTimber"),
    @XmlEnumValue("cubicCentimeterCC")
    CUBIC_CENTIMETER_CC("cubicCentimeterCC"),
    @XmlEnumValue("cubicCubitAncientEgypt")
    CUBIC_CUBIT_ANCIENT_EGYPT("cubicCubitAncientEgypt"),
    @XmlEnumValue("cubicDecimeter")
    CUBIC_DECIMETER("cubicDecimeter"),
    @XmlEnumValue("cubicDekameter")
    CUBIC_DEKAMETER("cubicDekameter"),
    @XmlEnumValue("cubicFoot")
    CUBIC_FOOT("cubicFoot"),
    @XmlEnumValue("cubicInch")
    CUBIC_INCH("cubicInch"),
    @XmlEnumValue("cubicKilometer")
    CUBIC_KILOMETER("cubicKilometer"),
    @XmlEnumValue("cubicMeter")
    CUBIC_METER("cubicMeter"),
    @XmlEnumValue("cubicMile")
    CUBIC_MILE("cubicMile"),
    @XmlEnumValue("cubicMillimeter")
    CUBIC_MILLIMETER("cubicMillimeter"),
    @XmlEnumValue("cubicYard")
    CUBIC_YARD("cubicYard"),
    @XmlEnumValue("cupCanada")
    CUP_CANADA("cupCanada"),
    @XmlEnumValue("cupMetric")
    CUP_METRIC("cupMetric"),
    @XmlEnumValue("cupUS")
    CUP_US("cupUS"),
    @XmlEnumValue("deciliter")
    DECILITER("deciliter"),
    @XmlEnumValue("dekaliter")
    DEKALITER("dekaliter"),
    @XmlEnumValue("fifth")
    FIFTH("fifth"),
    @XmlEnumValue("gallonUK")
    GALLON_UK("gallonUK"),
    @XmlEnumValue("gallonUSDry")
    GALLON_US_DRY("gallonUSDry"),
    @XmlEnumValue("gallonUSLiquid")
    GALLON_US_LIQUID("gallonUSLiquid"),
    @XmlEnumValue("gillUK")
    GILL_UK("gillUK"),
    @XmlEnumValue("gillUS")
    GILL_US("gillUS"),
    @XmlEnumValue("hectareMeter")
    HECTARE_METER("hectareMeter"),
    @XmlEnumValue("hectoliter")
    HECTOLITER("hectoliter"),
    @XmlEnumValue("hogsheadUK")
    HOGSHEAD_UK("hogsheadUK"),
    @XmlEnumValue("hogsheadUS")
    HOGSHEAD_US("hogsheadUS"),
    @XmlEnumValue("jigger")
    JIGGER("jigger"),
    @XmlEnumValue("kiloliter")
    KILOLITER("kiloliter"),
    @XmlEnumValue("liter")
    LITER("liter"),
    @XmlEnumValue("measureAncientHebrew")
    MEASURE_ANCIENT_HEBREW("measureAncientHebrew"),
    @XmlEnumValue("megaliter")
    MEGALITER("megaliter"),
    @XmlEnumValue("microliter")
    MICROLITER("microliter"),
    @XmlEnumValue("milliliter")
    MILLILITER("milliliter"),
    @XmlEnumValue("ounceUKLiquid")
    OUNCE_UK_LIQUID("ounceUKLiquid"),
    @XmlEnumValue("ounceUSLiquid")
    OUNCE_US_LIQUID("ounceUSLiquid"),
    @XmlEnumValue("peckUK")
    PECK_UK("peckUK"),
    @XmlEnumValue("peckUS")
    PECK_US("peckUS"),
    @XmlEnumValue("pintUK")
    PINT_UK("pintUK"),
    @XmlEnumValue("pintUSDry")
    PINT_US_DRY("pintUSDry"),
    @XmlEnumValue("pintUSLiquid")
    PINT_US_LIQUID("pintUSLiquid"),
    @XmlEnumValue("pipeUK")
    PIPE_UK("pipeUK"),
    @XmlEnumValue("pipeUS")
    PIPE_US("pipeUS"),
    @XmlEnumValue("pony")
    PONY("pony"),
    @XmlEnumValue("quartGermany")
    QUART_GERMANY("quartGermany"),
    @XmlEnumValue("quartAncientHebrew")
    QUART_ANCIENT_HEBREW("quartAncientHebrew"),
    @XmlEnumValue("quartUK")
    QUART_UK("quartUK"),
    @XmlEnumValue("quartUSDry")
    QUART_US_DRY("quartUSDry"),
    @XmlEnumValue("quartUSLiquid")
    QUART_US_LIQUID("quartUSLiquid"),
    @XmlEnumValue("quarterUKLiquid")
    QUARTER_UK_LIQUID("quarterUKLiquid"),
    @XmlEnumValue("scrupleUKLiquid")
    SCRUPLE_UK_LIQUID("scrupleUKLiquid"),
    @XmlEnumValue("stere")
    STERE("stere");
    private final String value;

    Volumes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Volumes fromValue(String v) {
        for (Volumes c: Volumes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
