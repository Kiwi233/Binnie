package binnie.botany.craftgui;

import binnie.botany.api.IColourMix;
import binnie.core.craftgui.controls.listbox.ControlList;
import binnie.core.craftgui.controls.listbox.ControlOption;

public class ControlColorMixItem extends ControlOption<IColourMix> {
	private final ControlColorDisplay itemWidget1;
	private final ControlColorDisplay itemWidget2;
	private final ControlColorDisplay itemWidget3;
	private final ControlColorMixSymbol addSymbol;
	private final ControlColorMixSymbol arrowSymbol;

	public ControlColorMixItem(final ControlList<IColourMix> controlList, final IColourMix option, final int y) {
		super(controlList, option, y);
		IColourMix value = this.getValue();
		this.itemWidget1 = new ControlColorDisplay(this, 4, 4, value.getColourFirst());
		this.itemWidget2 = new ControlColorDisplay(this, 44, 4, value.getColourSecond());
		this.itemWidget3 = new ControlColorDisplay(this, 104, 4, value.getResult());
		this.addSymbol = new ControlColorMixSymbol(this, 24, 4, 0, value);
		this.arrowSymbol = new ControlColorMixSymbol(this, 64, 4, 1, value);
	}
}
