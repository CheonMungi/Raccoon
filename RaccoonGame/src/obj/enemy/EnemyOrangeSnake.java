package obj.enemy;

import java.awt.Image;

import javax.swing.ImageIcon;

import constants.ImageConstants;
import main.RaccoonGame;

/**
 * 적 캐릭터 : 주황 뱀
 * @author CheonMungi
 *
 */
public class EnemyOrangeSnake extends EnemyAbst
{

	public EnemyOrangeSnake( int locationX, int locationY )
	{
		super( locationX, locationY );

		if( defaultSd.getDisplayMode().getWidth() == RaccoonGame.FRAME_FHD_SIZE_WIDTH )
		{
			rightDownImage = new ImageIcon( ImageConstants.DIR_DPI_FHD + ImageConstants.ENEMY_RIGHT_ORANGE_SNAKE_DOWN ).getImage();
			rightUpImage = new ImageIcon( ImageConstants.DIR_DPI_FHD + ImageConstants.ENEMY_RIGHT_ORANGE_SNAKE_UP ).getImage();
			leftDownImage = new ImageIcon( ImageConstants.DIR_DPI_FHD + ImageConstants.ENEMY_LEFT_ORANGE_SNAKE_DOWN ).getImage();
			leftUpImage = new ImageIcon( ImageConstants.DIR_DPI_FHD + ImageConstants.ENEMY_LEFT_ORANGE_SNAKE_UP ).getImage();
		}
		if( defaultSd.getDisplayMode().getWidth() == RaccoonGame.FRAME_UHD_SIZE_WIDTH )
		{
			rightDownImage = new ImageIcon( ImageConstants.DIR_DPI_UHD + ImageConstants.ENEMY_RIGHT_ORANGE_SNAKE_DOWN ).getImage();
			rightUpImage = new ImageIcon( ImageConstants.DIR_DPI_UHD + ImageConstants.ENEMY_RIGHT_ORANGE_SNAKE_UP ).getImage();
			leftDownImage = new ImageIcon( ImageConstants.DIR_DPI_UHD + ImageConstants.ENEMY_LEFT_ORANGE_SNAKE_DOWN ).getImage();
			leftUpImage = new ImageIcon( ImageConstants.DIR_DPI_UHD + ImageConstants.ENEMY_LEFT_ORANGE_SNAKE_UP ).getImage();
		}
		setDefaultSpeed( 3.75 );
	}

	@Override
	public Image getRightDownImage()
	{
		return rightDownImage;
	}

	@Override
	public Image getRightUpImage()
	{
		return rightUpImage;
	}

	@Override
	public Image getLeftDownImage()
	{
		return leftDownImage;
	}

	@Override
	public Image getLeftUpImage()
	{
		return leftUpImage;
	}

	@Override
	public void setRightDownImage( Image img )
	{
		rightDownImage = img;
	}

	@Override
	public void setRightUpImage( Image img )
	{
		rightUpImage = img;
	}

	@Override
	public void setLeftDownImage( Image img )
	{
		leftDownImage = img;
	}

	@Override
	public void setLeftUpImage( Image img )
	{
		leftUpImage = img;
	}

	@Override
	public EnemyEnum getEnemyENUM()
	{
		return EnemyEnum.ORANGE_SNAKE;
	}

	@Override
	public int getWidth()
	{
		// 이미지 가로 사이즈는 다 동일하므로 아무거나 상관없음
		return getLeftDownImage().getWidth( null );
	}

	@Override
	public int getHeight()
	{
		// 이미지 세로 사이즈는 다 동일하므로 아무거나 상관없음
		return getLeftDownImage().getHeight( null );
	}

}